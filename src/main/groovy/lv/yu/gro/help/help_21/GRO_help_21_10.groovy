
/**
 *
 * Groovy package     lv.yu.gro.help.help_21
 *
 * Groovy program     GRO_help_21_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023           mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.help.help_21

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_help_21_10
 */
public final class GRO_help_21_10_class {

/**
 * JTabbedPane_help_21
 */
    public static JTabbedPane JTabbedPane_help_21 = new JTabbedPane()

/**
 * JInternalFrame_help_21
 */
    public static JInternalFrame JInternalFrame_help_21 = new JInternalFrame()

/**
 * GRO_help_21_10()
 */
    public GRO_help_21_10_class() {

        JTabbedPane_help_21 = new JTabbedPane()
        JTabbedPane_help_21.removeAll()

        def GRO_help_21_about_10_class = new GRO_help_21_about_10_class()
        def GRO_help_21_help_10_class  = new GRO_help_21_help_10_class()

        JTabbedPane_help_21.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_help_21.setTabLayoutPolicy(JTabbedPane_help_21.SCROLL_TAB_LAYOUT)

        JInternalFrame_help_21 = new JInternalFrame("21 HELP", true, false, true, true)
        JInternalFrame_help_21.setLayout(new BorderLayout())
        JInternalFrame_help_21.setBackground(Color.GRAY)
        JInternalFrame_help_21.setVisible(true)

        JInternalFrame_help_21.add(JTabbedPane_help_21, BorderLayout.CENTER)

    }  //  end GRO_help_21_10_class()

}  //  end GRO_help_21_10_class
