
/**
 *
 * Groovy package     lv.yu.gro.help.help_22
 *
 * Groovy program     GRO_help_22_09.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023           mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.help.help_22

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_help_22_09
 */
public final class GRO_help_22_09_class {

/**
 * JTabbedPane_help_22
 */
    public static JTabbedPane JTabbedPane_help_22 = new JTabbedPane()

/**
 * JInternalFrame_help_22
 */
    public static JInternalFrame JInternalFrame_help_22 = new JInternalFrame()

/**
 * GRO_help_22_09()
 */
    public GRO_help_22_09_class() {

        JTabbedPane_help_22 = new JTabbedPane()
        JTabbedPane_help_22.removeAll()

        JTabbedPane_help_22.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_help_22.setTabLayoutPolicy(JTabbedPane_help_22.SCROLL_TAB_LAYOUT)

        JInternalFrame_help_22 = new JInternalFrame("22 HELP HELP HELP", true, false, true, true)
        JInternalFrame_help_22.setLayout(new BorderLayout())
        JInternalFrame_help_22.setBackground(Color.GRAY)
        JInternalFrame_help_22.setVisible(true)

        JInternalFrame_help_22.add(JTabbedPane_help_22, BorderLayout.CENTER)

    }  //  end GRO_help_22_09_class()

}  //  end GRO_help_22_09_class
