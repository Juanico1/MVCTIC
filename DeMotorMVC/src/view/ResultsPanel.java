package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class ResultsPanel extends JPanel {
    private JTable      tblResults;
    private JScrollPane jspPane;
   
    private void initComponents(){
        this.tblResults = new JTable();
        this.tblResults.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        this.jspPane = new JScrollPane(this.tblResults);
        add(jspPane, BorderLayout.CENTER);
        
        setPreferredSize(new Dimension(1020, 800));
    }
    
     public ResultsPanel(){
        initComponents();
    }   

    public JTable getTblResults() {
        return tblResults;
    }

    public void setTblResults(JTable tblResults) {
        this.tblResults = tblResults;
    }

    public JScrollPane getJspPane() {
        return jspPane;
    }

    public void setJspPane(JScrollPane jspPane) {
        this.jspPane = jspPane;
    }
    
    
}
