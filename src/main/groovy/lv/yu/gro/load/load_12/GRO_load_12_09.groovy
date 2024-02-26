
/**
 *
 * Groovy package     lv.yu.gro.load.load_12
 *
 * Groovy program     GRO_load_12_09.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023           mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.load.load_12

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_load_12_09
 */
public final class GRO_load_12_09_class {

/**
 * JTabbedPane_load_12
 */
    public static JTabbedPane JTabbedPane_load_12 = new JTabbedPane()

/**
 * JInternalFrame_load_12
 */
    public static JInternalFrame JInternalFrame_load_12 = new JInternalFrame()

/**
 * GRO_load_12_09()
 */
    public GRO_load_12_09_class() {

        JTabbedPane_load_12 = new JTabbedPane()
        JTabbedPane_load_12.removeAll()

        JTabbedPane_load_12.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_load_12.setTabLayoutPolicy(JTabbedPane_load_12.SCROLL_TAB_LAYOUT)

        JInternalFrame_load_12 = new JInternalFrame("12 LOAD LOAD LOAD", true, false, true, true)
        JInternalFrame_load_12.setLayout(new BorderLayout())
        JInternalFrame_load_12.setBackground(Color.GRAY)
        JInternalFrame_load_12.setVisible(true)

        JInternalFrame_load_12.add(JTabbedPane_load_12, BorderLayout.CENTER)

    }  //  end GRO_load_12_09_class()

}  //  end GRO_load_12_09_class
