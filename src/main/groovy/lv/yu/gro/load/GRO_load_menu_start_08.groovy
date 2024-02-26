
/**
 *
 * Groovy package     lv.yu.gro.load
 *
 * Groovy program     GRO_load_menu_start_08.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                   mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.load

import javax.swing.JMenuItem
import javax.swing.ImageIcon
import javax.swing.KeyStroke

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

/**
 * GRO_load_menu_start_08
 */
public class GRO_load_menu_start_08_class {

/**
 * GRO_load_menu_start_08()
 */
    public GRO_load_menu_start_08_class() {

//------------------------------

    var icon_Load = new ImageIcon( getClass().getResource("/lv/yu/gro/GRO_resources/load.gif") )

//------------------------------

      var item_Load = new JMenuItem("Load", icon_Load)
          item_Load.setToolTipText("Load application")
          item_Load.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.ALT_MASK))  //  Alt L

//------------------------------

          item_Load.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) { println("Selected menu: " + e.getActionCommand()) } } )

//------------------------------

        lv.yu.gro.start.GRO_start_menu_08_class.menu_Menu.add(item_Load)

        lv.yu.gro.GRO_08_internal_frames_class.menubar.add(lv.yu.gro.start.GRO_start_menu_08_class.menu_Menu)

//------------------------------

    }  //  end GRO_load_menu_start_08_class()

}  //  end GRO_load_menu_start_08_class
