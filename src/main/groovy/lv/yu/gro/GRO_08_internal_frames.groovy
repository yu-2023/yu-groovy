
/**
 *
 * Groovy package     lv.yu.gro
 *
 * Groovy program     GRO_08_internal_frames.groovy     Apache License 2.0
 *
 * Copyright (c)      Yuri Utkin 2023                   mob.+371 12345678     https://www.jago.lv
 *
 */
package lv.yu.gro

import javax.swing.JFrame
import javax.swing.ImageIcon
import javax.swing.JPanel
import javax.swing.JDesktopPane
import javax.swing.JLabel
import javax.swing.JMenuBar

import java.awt.Color
import java.awt.Dimension
import java.awt.BorderLayout

import javax.swing.WindowConstants

import javax.swing.SwingUtilities

//------------------------------

/** GRO_08_internal_frames */
public final class GRO_08_internal_frames_class {

    /** frame */
    public static JFrame frame = new JFrame()

    /** manubar */
    public static JMenuBar menubar = new JMenuBar()

    /** panel_1 */
    public static JPanel panel_1 = new JPanel()

    /** panel_2 */
    public static JPanel panel_2 = new JPanel()

    /** panel_3 */
    public static JPanel panel_3 = new JPanel()

    /** label_info */
    public static JLabel label_info = new JLabel()

    /** desktoppane_11 */
    public static JDesktopPane desktoppane_11 = new JDesktopPane()

    /** desktoppane_12 */
    public static JDesktopPane desktoppane_12 = new JDesktopPane()

    /** desktoppane_13 */
    public static JDesktopPane desktoppane_13 = new JDesktopPane()

    /** desktoppane_21 */
    public static JDesktopPane desktoppane_21 = new JDesktopPane()

    /** desktoppane_22 */
    public static JDesktopPane desktoppane_22 = new JDesktopPane()

    /** desktoppane_23 */
    public static JDesktopPane desktoppane_23 = new JDesktopPane()

//------------------------------

/** GRO_08_internal_frames demonstrates many Groovy Internal Frames in Groovy Frame */
public GRO_08_internal_frames_class() {

//------------------------------

        var imgURL =                   GRO_08_internal_frames.class.getResource("/lv/yu/gro/GRO_resources/GRO.jpg")
        var icon_frame = new ImageIcon(GRO_08_internal_frames.class.getResource("/lv/yu/gro/GRO_resources/GRO.jpg"))

//------------------------------

    var title = "GROOVY -- GRO_08_internal_frames -- v. 2023.12.12"

        frame.setTitle("     " + title)

        frame.setBounds(10+7*40, 10+7*40, 1000, 600)

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE)

        frame.setIconImage(icon_frame.getImage())

        frame.setLayout(new BorderLayout())

        frame.setVisible(true)

//------------------------------

        frame.setJMenuBar(menubar)

//------------------------------

        panel_1.setLayout(new BorderLayout())
        panel_1.setBackground(Color.CYAN)

        panel_2.setLayout(new BorderLayout())
        panel_2.setBackground(Color.MAGENTA)

        panel_3.setLayout(new BorderLayout())
        panel_3.setBackground(Color.lightGray)

        label_info.setText("     Copyright     (c)     Yuri Utkin 2023     mob.+371 12345678     https://www.jago.lv")
        label_info.setForeground(Color.BLACK)

        panel_3.add(label_info, BorderLayout.CENTER)

        frame.getContentPane().add(panel_1, BorderLayout.NORTH)
        frame.getContentPane().add(panel_2, BorderLayout.CENTER)
        frame.getContentPane().add(panel_3, BorderLayout.SOUTH)

//------------------------------

        desktoppane_11.setLayout(new BorderLayout())
        desktoppane_11.setBackground(Color.RED)
        desktoppane_11.setPreferredSize(new Dimension(200, 350))

        desktoppane_12.setLayout(new BorderLayout())
        desktoppane_12.setBackground(Color.PINK)
        desktoppane_12.setPreferredSize(new Dimension(600, 350))

        desktoppane_13.setLayout(new BorderLayout())
        desktoppane_13.setBackground(Color.YELLOW)
        desktoppane_13.setPreferredSize(new Dimension(200, 350))

        desktoppane_21.setLayout(new BorderLayout())
        desktoppane_21.setBackground(Color.BLUE)
        desktoppane_21.setPreferredSize(new Dimension(200, 150))

        desktoppane_22.setLayout(new BorderLayout())
        desktoppane_22.setBackground(Color.CYAN)
        desktoppane_22.setPreferredSize(new Dimension(600, 150))

        desktoppane_23.setLayout(new BorderLayout())
        desktoppane_23.setBackground(Color.GREEN)
        desktoppane_23.setPreferredSize(new Dimension(200, 150))

//--------------------------------------------------

    def GRO_start_visualize_08_class = new lv.yu.gro.start.GRO_start_visualize_08_class()

//------------------------------

        frame.setVisible(true)

//------------------------------

    }  //  end GRO_08_internal_frames_class()

//------------------------------

}  //  end GRO_08_internal_frames_class

//------------------------------

/**
 * GRO_08_internal_frames
 *
 * @param args[]
 */
    public static void main(String[] args) {
                                             SwingUtilities.invokeLater( () -> { new GRO_08_internal_frames_class() } )
    }  //  end main()

//------------------------------
