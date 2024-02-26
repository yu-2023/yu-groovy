
/**
 *
 * Groovy package     lv.yu.gro.start
 *
 * Groovy program     GRO_start_menu_start_08.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                    mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.start

import javax.swing.JMenuItem
import javax.swing.ImageIcon
import javax.swing.KeyStroke

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

/**
 * GRO_start_menu_start_08
 */
public class GRO_start_menu_start_08_class {

/**
 * GRO_start_menu_start_08()
 */
    public GRO_start_menu_start_08_class() {

//------------------------------

    var icon_Start = new ImageIcon( getClass().getResource("/lv/yu/gro/GRO_resources/start.gif") )

//------------------------------

      var item_Start = new JMenuItem("Start", icon_Start)
          item_Start.setToolTipText("Start application")
          item_Start.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK))  //  Alt S

//------------------------------

          item_Start.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) { def GRO_start_visualize_08_class = new lv.yu.gro.start.GRO_start_visualize_08_class() } } )

//------------------------------

        lv.yu.gro.start.GRO_start_menu_08_class.menu_Menu.add(item_Start)

        lv.yu.gro.GRO_08_internal_frames_class.menubar.add(lv.yu.gro.start.GRO_start_menu_08_class.menu_Menu)

//------------------------------

    }  //  end GRO_start_menu_start_08_class()

}  //  end GRO_start_menu_start_08_class
