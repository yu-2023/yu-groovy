
/**
 *
 * Groovy package     lv.yu.gro.xxxxx.xxxxx_12
 *
 * Groovy program     GRO_xxxxx_12_09.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.xxxxx.xxxxx_12

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_xxxxx_12_09
 */
public final class GRO_xxxxx_12_09_class {

/**
 * JTabbedPane_xxxxx_12
 */
    public static JTabbedPane JTabbedPane_xxxxx_12 = new JTabbedPane()

/**
 * JInternalFrame_xxxxx_12
 */
    public static JInternalFrame JInternalFrame_xxxxx_12 = new JInternalFrame()

/**
 * GRO_xxxxx_12_09()
 */
    public GRO_xxxxx_12_09_class() {

        JTabbedPane_xxxxx_12 = new JTabbedPane()
        JTabbedPane_xxxxx_12.removeAll()

        JTabbedPane_xxxxx_12.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_xxxxx_12.setTabLayoutPolicy(JTabbedPane_xxxxx_12.SCROLL_TAB_LAYOUT)

        JInternalFrame_xxxxx_12 = new JInternalFrame("12 XXXXX XXXXX XXXXX", true, false, true, true)
        JInternalFrame_xxxxx_12.setLayout(new BorderLayout())
        JInternalFrame_xxxxx_12.setBackground(Color.GRAY)
        JInternalFrame_xxxxx_12.setVisible(true)

        JInternalFrame_xxxxx_12.add(JTabbedPane_xxxxx_12, BorderLayout.CENTER)

    }  //  end GRO_xxxxx_12_09_class()

}  //  end GRO_xxxxx_12_09_class
