
/**
 *
 * Groovy package     lv.yu.gro.start.start_12
 *
 * Groovy program     GRO_start_12_08.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.start.start_12

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_start_12_08
 */
public final class GRO_start_12_08_class {

/**
 * JTabbedPane_start_12
 */
    public static JTabbedPane JTabbedPane_start_12 = new JTabbedPane()

/**
 * JInternalFrame_start_12
 */
    public static JInternalFrame JInternalFrame_start_12 = new JInternalFrame()

/**
 * GRO_start_12_08()
 */
    public GRO_start_12_08_class() {

        JTabbedPane_start_12 = new JTabbedPane()
        JTabbedPane_start_12.removeAll()

        JTabbedPane_start_12.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_start_12.setTabLayoutPolicy(JTabbedPane_start_12.SCROLL_TAB_LAYOUT)

        JInternalFrame_start_12 = new JInternalFrame("12 START START START", true, false, true, true)
        JInternalFrame_start_12.setLayout(new BorderLayout())
        JInternalFrame_start_12.setBackground(Color.GRAY)
        JInternalFrame_start_12.setVisible(true)

        JInternalFrame_start_12.add(JTabbedPane_start_12, BorderLayout.CENTER)

    }  //  end GRO_start_12_08_class()

}  //  end GRO_start_12_08_class
