import java.io.FileInputStream
import java.io.File
import java.util.Properties

val fis = FileInputStream(File(rootDir.parentFile, "examples.properties"))
val props = Properties()
fis.use {
    props.load(it)
}

val extraProps = extensions.getByType(ExtraPropertiesExtension::class)

props.stringPropertyNames().forEach {
    extraProps.set(it, props.getProperty(it))
}
extraProps.set("localRepo.path", File(rootDir.parentFile, "${extraProps["localRepo.name"]}").absolutePath)
