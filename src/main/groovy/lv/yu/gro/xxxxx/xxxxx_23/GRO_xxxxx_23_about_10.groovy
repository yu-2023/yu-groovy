
/**
 *
 * Groovy package     lv.yu.gro.xxxxx.xxxxx_23
 *
 * Groovy program     GRO_xxxxx_23_about_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                  mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.xxxxx.xxxxx_23

import javax.swing.JTextArea
import javax.swing.ImageIcon

import java.awt.event.KeyEvent

/**
 * GRO_xxxxx_23_about_10
 */
public class GRO_xxxxx_23_about_10_class {

/**
 * GRO_xxxxx_23_about_10()
 */
    public GRO_xxxxx_23_about_10_class() {

    var imageicon = new ImageIcon(GRO_xxxxx_23_about_10_class.class.getResource("/lv/yu/gro/GRO_resources/info.gif"))

    var jtextarea = new JTextArea()
        jtextarea.setText("GRO_xxxxx_23_about_10_JTextArea")

        GRO_xxxxx_23_10_class.JTabbedPane_xxxxx_23.addTab("about", imageicon, jtextarea, "Load about JTextArea")
        GRO_xxxxx_23_10_class.JTabbedPane_xxxxx_23.setMnemonicAt(0, KeyEvent.VK_A)  //  Alt A

    }  //  end GRO_xxxxx_23_about_10_class()

}  //  end GRO_xxxxx_23_about_10_class
