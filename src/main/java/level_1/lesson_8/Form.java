package level_1.lesson_8;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form extends JFrame {

    private DefaultTableModel tableModel;
    private JTable table;
    private String[] columnsHeader = new String[] {"Nomenclature", "Quantity", "Price", "Sum"};
    private Object[] data = new Object[4];

    public Form() {

        setTitle("Sale of goods and services");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(0, 0, 1000, 500);

        addUpperPanel();

        tableModel = new DefaultTableModel();
        table = new JTable(tableModel);
        tableModel.setColumnIdentifiers(columnsHeader);
        tableModel.addRow(data);

        Box contents = new Box(BoxLayout.Y_AXIS);
        contents.add(new JScrollPane(table));
        add(contents, BorderLayout.CENTER);

        setVisible(true);
    }

    private void addUpperPanel() {

        JPanel panelClient = new JPanel();
        panelClient.setLayout(new FlowLayout(FlowLayout.LEFT));

        panelClient.add(new JLabel("Client: "));
        panelClient.add(new JTextField(25));

        panelClient.add(new JLabel("Warehouse: "));
        panelClient.add(new JTextField(25));


        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableModel.addRow(data);
            }
        });

        JButton deleteButton = new JButton("Delete");
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tableModel.removeRow(table.getSelectedRow());
            }
        });

        JPanel panelButton = new JPanel();
        panelButton.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelButton.add(addButton);
        panelButton.add(deleteButton);


        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(panelClient, BorderLayout.NORTH);
        panel.add(panelButton, BorderLayout.SOUTH);

        add(panel, BorderLayout.NORTH);
    }
}
