
/**
 *
 * Groovy package     lv.yu.gro.load.load_12
 *
 * Groovy program     GRO_load_12_about_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                 mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.load.load_12

import javax.swing.JTextArea
import javax.swing.ImageIcon

import java.awt.event.KeyEvent

/**
 * GRO_load_12_about_10
 */
public class GRO_load_12_about_10_class {

/**
 * GRO_load_12_about_10()
 */
    public GRO_load_12_about_10_class() {

    var imageicon = new ImageIcon(GRO_load_12_about_10_class.class.getResource("/lv/yu/gro/GRO_resources/info.gif"))

    var jtextarea = new JTextArea()
        jtextarea.setText("GRO_load_12_about_10_JTextArea")

        GRO_load_12_10_class.JTabbedPane_load_12.addTab("about", imageicon, jtextarea, "Load about JTextArea")
        GRO_load_12_10_class.JTabbedPane_load_12.setMnemonicAt(0, KeyEvent.VK_A)  //  Alt A

    }  //  end GRO_load_12_about_10_class()

}  //  end GRO_load_12_about_10_class
