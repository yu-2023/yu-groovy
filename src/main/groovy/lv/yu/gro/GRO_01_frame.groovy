
/**
 *
 * Groovy package     lv.yu.gro
 *
 * Groovy program     GRO_01_frame.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023         mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro

import javax.swing.JFrame
import javax.swing.ImageIcon

import java.awt.BorderLayout

import javax.swing.WindowConstants

import javax.swing.SwingUtilities

//------------------------------

/** GRO_01_frame */
public final class GRO_01_frame_class {

    /** frame */
    public static JFrame frame = new JFrame()

//------------------------------

/** GRO_01_frame demonstrates Groovy Frame */
public GRO_01_frame_class() {

        var imgURL =               GRO_01_frame_class.class.getResource("/lv/yu/gro/GRO_resources/GRO.jpg")
    var icon_frame = new ImageIcon(GRO_01_frame_class.class.getResource("/lv/yu/gro/GRO_resources/GRO.jpg"))

//------------------------------

    var title = "GROOVY -- GRO_01_frame -- v. 2023.12.12"

        frame.setTitle("     " + title)

        frame.setBounds(10+0*40, 10+0*40, 1000, 600)

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)

        frame.setIconImage(icon_frame.getImage())

        frame.setLayout(new BorderLayout())

        frame.setVisible(true)

//------------------------------

    }  //  end GRO_01_frame_class()

//------------------------------

}  //  end GRO_01_frame_class

//------------------------------

/**
 * GRO_01_frame
 *
 * @param args[]
 */
    public static void main(String[] args) {
                                             SwingUtilities.invokeLater( () -> { new           GRO_01_frame_class() } )
                                                                                 new lv.yu.gro.GRO_02_text_class();
                                                                                 new lv.yu.gro.GRO_03_menu_class();
                                                                                 new lv.yu.gro.GRO_04_menu_wrap_class();
                                                                                 new lv.yu.gro.GRO_05_action_class();
                                                                                 new lv.yu.gro.GRO_06_internal_frame_one_class();
                                                                                 new lv.yu.gro.GRO_07_internal_frame_six_class();
                                                                                 new lv.yu.gro.GRO_08_internal_frames_class();
                                                                                 new lv.yu.gro.GRO_09_internal_frames_change_class();
                                                                                 new lv.yu.gro.GRO_10_tabs_class();
    }  //  end main

//------------------------------
