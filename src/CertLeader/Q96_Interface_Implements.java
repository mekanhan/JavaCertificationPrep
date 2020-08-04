package CertLeader;

import javax.tools.Tool;

public class Q96_Interface_Implements {
    interface NonExportable{
        void export();
    }

    public static void main(String[] args) {
        Q96_Tool aTool = new Q96_ReportTool();
        Q96_Tool bTool = new Q96_Tool();
        aTool.export();
        bTool.export();
        }

        public static void callExport(NonExportable ex){
            ex.export();
        }
}

