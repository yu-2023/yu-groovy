
/**
 *
 * Groovy package     lv.yu.gro.start.start_22
 *
 * Groovy program     GRO_start_22_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.start.start_22

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_start_22_10
 */
public final class GRO_start_22_10_class {

/**
 * JTabbedPane_start_22
 */
    public static JTabbedPane JTabbedPane_start_22 = new JTabbedPane()

/**
 * JInternalFrame_start_22
 */
    public static JInternalFrame JInternalFrame_start_22 = new JInternalFrame()

/**
 * GRO_start_22_10()
 */
    public GRO_start_22_10_class() {

        JTabbedPane_start_22 = new JTabbedPane()
        JTabbedPane_start_22.removeAll()

        def GRO_start_22_about_10_class = new GRO_start_22_about_10_class()
        def GRO_start_22_help_10_class  = new GRO_start_22_help_10_class()

        JTabbedPane_start_22.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_start_22.setTabLayoutPolicy(JTabbedPane_start_22.SCROLL_TAB_LAYOUT)

        JInternalFrame_start_22 = new JInternalFrame("22 START START START", true, false, true, true)
        JInternalFrame_start_22.setLayout(new BorderLayout())
        JInternalFrame_start_22.setBackground(Color.GRAY)
        JInternalFrame_start_22.setVisible(true)

        JInternalFrame_start_22.add(JTabbedPane_start_22, BorderLayout.CENTER)

    }  //  end GRO_start_22_10_class()

}  //  end GRO_start_22_10_class
