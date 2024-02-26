
/**
 *
 * Groovy package     lv.yu.gro.xxxxx.xxxxx_22
 *
 * Groovy program     GRO_xxxxx_22_09.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023            mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.xxxxx.xxxxx_22

import java.awt.Color
import java.awt.BorderLayout

import javax.swing.JTabbedPane
import javax.swing.SwingConstants
import javax.swing.JInternalFrame

/**
 * GRO_xxxxx_22_09
 */
public final class GRO_xxxxx_22_09_class {

/**
 * JTabbedPane_xxxxx_22
 */
    public static JTabbedPane JTabbedPane_xxxxx_22 = new JTabbedPane()

/**
 * JInternalFrame_xxxxx_22
 */
    public static JInternalFrame JInternalFrame_xxxxx_22 = new JInternalFrame()

/**
 * GRO_xxxxx_22_09()
 */
    public GRO_xxxxx_22_09_class() {

        JTabbedPane_xxxxx_22 = new JTabbedPane()
        JTabbedPane_xxxxx_22.removeAll()

        JTabbedPane_xxxxx_22.setTabPlacement(SwingConstants.BOTTOM)
        JTabbedPane_xxxxx_22.setTabLayoutPolicy(JTabbedPane_xxxxx_22.SCROLL_TAB_LAYOUT)

        JInternalFrame_xxxxx_22 = new JInternalFrame("22 XXXXX XXXXX XXXXX", true, false, true, true)
        JInternalFrame_xxxxx_22.setLayout(new BorderLayout())
        JInternalFrame_xxxxx_22.setBackground(Color.GRAY)
        JInternalFrame_xxxxx_22.setVisible(true)

        JInternalFrame_xxxxx_22.add(JTabbedPane_xxxxx_22, BorderLayout.CENTER)

    }  //  end GRO_xxxxx_22_09_class()

}  //  end GRO_xxxxx_22_09_class
