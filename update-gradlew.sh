#!/bin/bash
set -e

for proj in $(sed -n "s/^examples\.projects=\(.*\)$/\1/p" examples.properties); do
  extra_args=""
  for proj_inc in $(sed -n "s/^examples\.${proj}\.includedBuilds=\(.*\)$/\1/p" examples.properties); do
    extra_args="${extra_args} --include-build \"../${proj_inc}\""
  done

  pushd "${proj}"
  wrapper_cmd="./gradlew --console=plain wrapper${extra_args}"
  echo "${wrapper_cmd}"
  eval "${wrapper_cmd}"
  popd
done
