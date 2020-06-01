
package com.github.oesolutions.gradle.widget;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

/**
 * Widget Gradle plugin.
 */
public class WidgetPlugin implements Plugin<Project>
{
    @Override
    public void apply( final Project project )
    {
        project.getLogger().lifecycle( "Applying widget plugin to " + project.getName() );
    }
}
