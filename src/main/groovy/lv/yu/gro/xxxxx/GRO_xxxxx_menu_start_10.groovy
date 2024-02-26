
/**
 *
 * Groovy package     lv.yu.gro.xxxxx
 *
 * Groovy program     GRO_xxxxx_menu_start_10.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                    mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro.xxxxx

import javax.swing.JMenuItem
import javax.swing.ImageIcon
import javax.swing.KeyStroke

import java.awt.event.KeyEvent
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

/**
 * GRO_xxxxx_menu_start_10
 */
public class GRO_xxxxx_menu_start_10_class {

/**
 * GRO_xxxxx_menu_start_10()
 */
    public GRO_xxxxx_menu_start_10_class() {

//------------------------------

    var icon_Xxxx = new ImageIcon( getClass().getResource("/lv/yu/gro/GRO_resources/xxxx.png") )

//------------------------------

      var item_Xxxx = new JMenuItem("Xxxx", icon_Xxxx)
          item_Xxxx.setToolTipText("Xxxx application")
          item_Xxxx.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.ALT_MASK))  //  Alt X

//------------------------------

          item_Xxxx.addActionListener(new ActionListener() {
              public void actionPerformed(ActionEvent e) { def GRO_xxxxx_visualize_10_class = new lv.yu.gro.xxxxx.GRO_xxxxx_visualize_10_class() } } )

//------------------------------

        lv.yu.gro.start.GRO_start_menu_10_class.menu_Menu.add(item_Xxxx)

        lv.yu.gro.GRO_10_tabs_class.menubar.add(lv.yu.gro.start.GRO_start_menu_10_class.menu_Menu)

//------------------------------

    }  //  end GRO_xxxxx_menu_start_10_class()

}  //  end GRO_xxxxx_menu_start_10_class
