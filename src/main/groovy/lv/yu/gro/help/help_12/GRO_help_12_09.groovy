
/**
 *
 * Groovy package     lv.yu.gro.help.help_12
 *
 * Groovy program     GRO_help_12_09.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023           mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.help.help_12

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_help_12_09
 */
public final class GRO_help_12_09_class {

/**
 * JTabbedPane_help_12
 */
    public static JTabbedPane JTabbedPane_help_12 = new JTabbedPane()

/**
 * JInternalFrame_help_12
 */
    public static JInternalFrame JInternalFrame_help_12 = new JInternalFrame()

/**
 * GRO_help_12_09()
 */
    public GRO_help_12_09_class() {

        JTabbedPane_help_12 = new JTabbedPane()
        JTabbedPane_help_12.removeAll()

        JTabbedPane_help_12.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_help_12.setTabLayoutPolicy(JTabbedPane_help_12.SCROLL_TAB_LAYOUT)

        JInternalFrame_help_12 = new JInternalFrame("12 HELP HELP HELP", true, false, true, true)
        JInternalFrame_help_12.setLayout(new BorderLayout())
        JInternalFrame_help_12.setBackground(Color.GRAY)
        JInternalFrame_help_12.setVisible(true)

        JInternalFrame_help_12.add(JTabbedPane_help_12, BorderLayout.CENTER)

    }  //  end GRO_help_12_09_class()

}  //  end GRO_help_12_09_class
