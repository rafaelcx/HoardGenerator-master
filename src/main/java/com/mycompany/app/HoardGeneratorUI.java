package com.mycompany.app;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import com.intellij.uiDesigner.core.Spacer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HoardGeneratorUI {

    private JPanel Jpanel;

    private JLabel select_hoard_description;
    private JLabel tittle;

    private JRadioButton local_challenge_radio_btn;
    private JRadioButton regional_challenge_radio_btn;
    private JRadioButton national_challenge_radio_btn;
    private JRadioButton world_challenge_radio_btn;

    private JButton make_loot;
    private JButton quit;

    private javax.swing.JScrollPane JScrollPane;
    private JButton rollHoardLootButton;
    private JButton clearButton;
    private JEditorPane textArea1;

    public HoardGeneratorUI() {

        ButtonGroup button_group = new ButtonGroup();
        button_group.add(local_challenge_radio_btn);
        button_group.add(regional_challenge_radio_btn);
        button_group.add(national_challenge_radio_btn);
        button_group.add(world_challenge_radio_btn);

        local_challenge_radio_btn.setSelected(true);


        make_loot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    TreasureHoard treasure_hoard;

                    if (local_challenge_radio_btn.isSelected()) {
                        treasure_hoard = TreasureHoardManager.build(TreasureHoard.LOCAL_HERO_TIER);
                        printHoardAtTextArea(treasure_hoard, "Individual treasure for challenge rating: 1-4");
                    }

                    else if (regional_challenge_radio_btn.isSelected()) {
                        treasure_hoard = TreasureHoardManager.build(TreasureHoard.REGIONAL_HERO_TIER);
                        printHoardAtTextArea(treasure_hoard, "Individual treasure for challenge rating: 5-10");
                    }

                    else if (national_challenge_radio_btn.isSelected()) {
                        treasure_hoard = TreasureHoardManager.build(TreasureHoard.NATIONAL_HERO_TIER);
                        printHoardAtTextArea(treasure_hoard, "Individual treasure for challenge rating: 11-16");
                    }

                    else if (world_challenge_radio_btn.isSelected()) {
                        treasure_hoard = TreasureHoardManager.build(TreasureHoard.WORLD_HERO_TIER);
                        printHoardAtTextArea(treasure_hoard, "Individual treasure for challenge rating: 17-20");
                    }

                    else
                        JOptionPane.showMessageDialog(null, "You must select one of the game tiers to generate a Treasure Hoard");

                } catch (Exception e) {
                    textArea1.setText(textArea1.getText() + e.getMessage());
                }

            }
        });

        rollHoardLootButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                TreasureHoard treasure_hoard = new TreasureHoard();

                if (local_challenge_radio_btn.isSelected()) {
                    for (int i = 0; i < 7; i++) {
                        TreasureHoard temp_th = TreasureHoardManager.build(TreasureHoard.LOCAL_HERO_TIER);

                        treasure_hoard.setCopperPieces(treasure_hoard.getCopperPieces() + temp_th.getCopperPieces());
                        treasure_hoard.setSilverPieces(treasure_hoard.getSilverPieces() + temp_th.getSilverPieces());
                        treasure_hoard.setGoldPieces(treasure_hoard.getGoldPieces() + temp_th.getGoldPieces());
                        treasure_hoard.setPlatinumPieces(treasure_hoard.getPlatinumPieces() + temp_th.getPlatinumPieces());
                        treasure_hoard.setValuables(treasure_hoard.getValuables() + "\n" + temp_th.getValuables());
                        treasure_hoard.setMagicItems(treasure_hoard.getMagicItems() + temp_th.getMagicItems());
                    }

                    printHoardAtTextArea(treasure_hoard, "Hoard for challenge rating: 1-4");
                }

                else if (regional_challenge_radio_btn.isSelected()) {
                    for (int i = 0; i < 18; i++) {
                        TreasureHoard temp_th = TreasureHoardManager.build(TreasureHoard.REGIONAL_HERO_TIER);

                        treasure_hoard.setCopperPieces(treasure_hoard.getCopperPieces() + temp_th.getCopperPieces());
                        treasure_hoard.setSilverPieces(treasure_hoard.getSilverPieces() + temp_th.getSilverPieces());
                        treasure_hoard.setGoldPieces(treasure_hoard.getGoldPieces() + temp_th.getGoldPieces());
                        treasure_hoard.setPlatinumPieces(treasure_hoard.getPlatinumPieces() + temp_th.getPlatinumPieces());
                        treasure_hoard.setValuables(treasure_hoard.getValuables() + "\n" + temp_th.getValuables());
                        treasure_hoard.setMagicItems(treasure_hoard.getMagicItems() + temp_th.getMagicItems());
                    }

                    printHoardAtTextArea(treasure_hoard, "Hoard for challenge rating: 5-10");
                }

                else if (national_challenge_radio_btn.isSelected()) {
                    for (int i = 0; i < 12; i++) {
                        TreasureHoard temp_th = TreasureHoardManager.build(TreasureHoard.NATIONAL_HERO_TIER);

                        treasure_hoard.setCopperPieces(treasure_hoard.getCopperPieces() + temp_th.getCopperPieces());
                        treasure_hoard.setSilverPieces(treasure_hoard.getSilverPieces() + temp_th.getSilverPieces());
                        treasure_hoard.setGoldPieces(treasure_hoard.getGoldPieces() + temp_th.getGoldPieces());
                        treasure_hoard.setPlatinumPieces(treasure_hoard.getPlatinumPieces() + temp_th.getPlatinumPieces());
                        treasure_hoard.setValuables(treasure_hoard.getValuables() + "\n" + temp_th.getValuables());
                        treasure_hoard.setMagicItems(treasure_hoard.getMagicItems() + temp_th.getMagicItems());
                    }

                    printHoardAtTextArea(treasure_hoard, "Hoard for challenge rating: 11-16");
                }

                else if (world_challenge_radio_btn.isSelected()) {
                    for (int i = 0; i < 8; i++) {
                        TreasureHoard temp_th = TreasureHoardManager.build(TreasureHoard.WORLD_HERO_TIER);

                        treasure_hoard.setCopperPieces(treasure_hoard.getCopperPieces() + temp_th.getCopperPieces());
                        treasure_hoard.setSilverPieces(treasure_hoard.getSilverPieces() + temp_th.getSilverPieces());
                        treasure_hoard.setGoldPieces(treasure_hoard.getGoldPieces() + temp_th.getGoldPieces());
                        treasure_hoard.setPlatinumPieces(treasure_hoard.getPlatinumPieces() + temp_th.getPlatinumPieces());
                        treasure_hoard.setValuables(treasure_hoard.getValuables() + "\n" + temp_th.getValuables());
                        treasure_hoard.setMagicItems(treasure_hoard.getMagicItems() + temp_th.getMagicItems());
                    }

                    printHoardAtTextArea(treasure_hoard, "Hoard for challenge rating: 17-20");
                }

                else
                    JOptionPane.showMessageDialog(null, "You must select one of the game tiers to generate a Treasure Hoard");


            }
        });

        quit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textArea1.setText("");
            }
        });

    }

    private void printHoardAtTextArea(TreasureHoard treasure_hoard, String header) {
        textArea1.setText(textArea1.getText() + header + "\n");

        textArea1.setText(
                textArea1.getText() +
                        "      - " +
                        treasure_hoard.getCopperPieces() + " pc + " +
                        treasure_hoard.getSilverPieces() + " pp + " +
                        treasure_hoard.getGoldPieces() + " po + " +
                        treasure_hoard.getPlatinumPieces() + " pp"
        );

        textArea1.setText(textArea1.getText() + "\n" + "      - " + treasure_hoard.getValuables());
        textArea1.setText(textArea1.getText() + "\n" + "      - " + "Magic Items:\n" + treasure_hoard.getMagicItems());
        textArea1.setText(textArea1.getText() + "\n" + "- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -" + "\n");
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("Loot Generator");

        frame.setPreferredSize(new Dimension(450, 700));
        frame.setContentPane(new HoardGeneratorUI().Jpanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        Jpanel = new JPanel();
        Jpanel.setLayout(new GridLayoutManager(12, 7, new Insets(8, 8, 8, 8), -1, -1));
        Jpanel.setMaximumSize(new Dimension(2147483647, 2147483647));
        Jpanel.setOpaque(false);
        Jpanel.setPreferredSize(new Dimension(350, 500));
        tittle = new JLabel();
        tittle.setText("Gimble Gamble's Horde Loot Generator");
        Jpanel.add(tittle, new GridConstraints(0, 1, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        select_hoard_description = new JLabel();
        select_hoard_description.setText("Select Horde CR:");
        Jpanel.add(select_hoard_description, new GridConstraints(2, 1, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        local_challenge_radio_btn = new JRadioButton();
        local_challenge_radio_btn.setText("Challenge 0-4");
        Jpanel.add(local_challenge_radio_btn, new GridConstraints(3, 1, 1, 5, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        regional_challenge_radio_btn = new JRadioButton();
        regional_challenge_radio_btn.setText("Challenge 5-10");
        Jpanel.add(regional_challenge_radio_btn, new GridConstraints(4, 1, 1, 2, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        national_challenge_radio_btn = new JRadioButton();
        national_challenge_radio_btn.setText("Challenge 11-16");
        Jpanel.add(national_challenge_radio_btn, new GridConstraints(5, 1, 1, 3, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        world_challenge_radio_btn = new JRadioButton();
        world_challenge_radio_btn.setText("Challenge 17-20");
        Jpanel.add(world_challenge_radio_btn, new GridConstraints(6, 1, 1, 4, GridConstraints.ANCHOR_WEST, GridConstraints.FILL_NONE, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final Spacer spacer1 = new Spacer();
        Jpanel.add(spacer1, new GridConstraints(8, 1, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer2 = new Spacer();
        Jpanel.add(spacer2, new GridConstraints(10, 1, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer3 = new Spacer();
        Jpanel.add(spacer3, new GridConstraints(9, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        quit = new JButton();
        quit.setText("Quit");
        Jpanel.add(quit, new GridConstraints(11, 2, 1, 4, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JSeparator separator1 = new JSeparator();
        Jpanel.add(separator1, new GridConstraints(7, 1, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        final JSeparator separator2 = new JSeparator();
        Jpanel.add(separator2, new GridConstraints(1, 1, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        JScrollPane = new JScrollPane();
        Jpanel.add(JScrollPane, new GridConstraints(9, 1, 1, 5, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        textArea1 = new JEditorPane();
        textArea1.setContentType("text/plain");
        JScrollPane.setViewportView(textArea1);
        final Spacer spacer4 = new Spacer();
        Jpanel.add(spacer4, new GridConstraints(11, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_WANT_GROW, 1, null, null, null, 0, false));
        final Spacer spacer5 = new Spacer();
        Jpanel.add(spacer5, new GridConstraints(9, 6, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_VERTICAL, 1, GridConstraints.SIZEPOLICY_WANT_GROW, null, null, null, 0, false));
        rollHoardLootButton = new JButton();
        rollHoardLootButton.setText("Roll Hoard Loot");
        Jpanel.add(rollHoardLootButton, new GridConstraints(4, 3, 1, 3, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        make_loot = new JButton();
        make_loot.setText("Roll Single Loot");
        Jpanel.add(make_loot, new GridConstraints(5, 4, 1, 2, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        clearButton = new JButton();
        clearButton.setText("Clear");
        Jpanel.add(clearButton, new GridConstraints(6, 5, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return Jpanel;
    }

}
