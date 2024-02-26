
/**
 *
 * Groovy package     lv.yu.gro.help.help_13
 *
 * Groovy program     GRO_help_13_09.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023           mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.help.help_13

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_help_13_09
 */
public final class GRO_help_13_09_class {

/**
 * JTabbedPane_help_13
 */
    public static JTabbedPane JTabbedPane_help_13 = new JTabbedPane()

/**
 * JInternalFrame_help_13
 */
    public static JInternalFrame JInternalFrame_help_13 = new JInternalFrame()

/**
 * GRO_help_13_09()
 */
    public GRO_help_13_09_class() {

        JTabbedPane_help_13 = new JTabbedPane()
        JTabbedPane_help_13.removeAll()

        JTabbedPane_help_13.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_help_13.setTabLayoutPolicy(JTabbedPane_help_13.SCROLL_TAB_LAYOUT)

        JInternalFrame_help_13 = new JInternalFrame("13 HELP", true, false, true, true)
        JInternalFrame_help_13.setLayout(new BorderLayout())
        JInternalFrame_help_13.setBackground(Color.GRAY)
        JInternalFrame_help_13.setVisible(true)

        JInternalFrame_help_13.add(JTabbedPane_help_13, BorderLayout.CENTER)

    }  //  end GRO_help_13_09_class()

}  //  end GRO_help_13_09_class
