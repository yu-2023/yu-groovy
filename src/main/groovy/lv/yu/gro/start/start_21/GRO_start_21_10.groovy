
/**
 *
 * Groovy package     lv.yu.gro.start.start_21
 *
 * Groovy program     GRO_start_21_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.start.start_21

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_start_21_10
 */
public final class GRO_start_21_10_class {

/**
 * JTabbedPane_start_21
 */
    public static JTabbedPane JTabbedPane_start_21 = new JTabbedPane()

/**
 * JInternalFrame_start_21
 */
    public static JInternalFrame JInternalFrame_start_21 = new JInternalFrame()

/**
 * GRO_start_21_10()
 */
    public GRO_start_21_10_class() {

        JTabbedPane_start_21 = new JTabbedPane()
        JTabbedPane_start_21.removeAll()

        def GRO_start_21_about_10_class = new GRO_start_21_about_10_class()
        def GRO_start_21_help_10_class  = new GRO_start_21_help_10_class()

        JTabbedPane_start_21.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_start_21.setTabLayoutPolicy(JTabbedPane_start_21.SCROLL_TAB_LAYOUT)

        JInternalFrame_start_21 = new JInternalFrame("21 START", true, false, true, true)
        JInternalFrame_start_21.setLayout(new BorderLayout())
        JInternalFrame_start_21.setBackground(Color.GRAY)
        JInternalFrame_start_21.setVisible(true)

        JInternalFrame_start_21.add(JTabbedPane_start_21, BorderLayout.CENTER)

    }  //  end GRO_start_21_10_class()

}  //  end GRO_start_21_10_class
