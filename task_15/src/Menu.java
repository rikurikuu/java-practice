import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public class Menu extends JFrame {
    final private JComboBox menu;
    private JLabel labelStart, labelChoose;

    Menu(){
        setSize(1000, 100);
        setLayout(new FlowLayout());
        String [] stringMenu = {"Australia", "China", "England", "Russia"};
        menu = new JComboBox<>(stringMenu);
        menu.setBounds(80, 50, 140, 20);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                if (menu.getSelectedItem() == "Australia")
                    labelChoose.setText("В Австралии существует собственный диалект английского языка, неофициально называемый «страйн» (англ. strine, от австралийского произношения слова «Australian»). Отдельно выделяется английский язык австралийских аборигенов.");
                else if (menu.getSelectedItem() == "China")
                    labelChoose.setText("Культура Китая — одна из самых древних и самобытных в мире, она оказала большое влияние на развитие культуры многочисленных соседних народов, населявших обширные территории позднейших Монголии, Тибета, Индокитая, Кореи и Японии.");
                else if (menu.getSelectedItem() == "England")
                    labelChoose.setText("Соединённое Королевство возникло в результате ряда аннексий, союзов и отделений входящих в него стран в течение нескольких сотен лет. Королевство Великобритания образовалось в 1707 году в результате подписания Договора об Унии между Королевством Англия (в которое уже входил Уэльс, присоединённый в 1542 годуruen) и Королевством Шотландия.");
                else labelChoose.setText("Россия — многонациональное государство с широким этнокультурным многообразием. Согласно результатам переписей населения России 2010 года, а также Крыма и Севастополя 2014 года в стране живут представители свыше 190 национальностей, среди которых русские составляют свыше 80 %, а русским языком владеют свыше 99,4 % россиян. Бо́льшая часть населения (около 75 %) в религиозном отношении относит себя к православию, что делает Россию страной с самым многочисленным православным населением в мире.");
            }
        });
        labelStart = new JLabel("Выберите страну: ");
        labelStart.setBounds(90, 100, 400, 100);
        labelChoose = new JLabel("Страна не выбрана");
        labelChoose.setBounds(90, 100, 400, 100);
        add(labelStart);
        add(menu);
        add(labelChoose);
        setVisible(true);
    }

    public static void main(String [] args){
        new Menu();
    }
}
