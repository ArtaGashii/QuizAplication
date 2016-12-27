package org.alphaecho.quizapplication;

/**
 * Created by Arta on 12/27/2016.
 */


    public class Question {
        private int ID;
        private String PYETJA;
        private String OPSA;
        private String OPSB;
        private String OPSC;
        private String PERGJIGJJA;
        public Question()
        {
            ID=0;
            PYETJA="";
            OPSA="";
            OPSB="";
            OPSC="";
            PERGJIGJJA="";
        }
        public Question(String pYETJA, String oPSA, String oPSB, String oPSC,
                        String pERGJIGJJA) {

            PYETJA = pYETJA;
            OPSA = oPSA;
            OPSB = oPSB;
            OPSC = oPSC;
            PERGJIGJJA = pERGJIGJJA;
        }
        public int getID()
        {
            return ID;
        }
        public String getPYETJA() {
            return PYETJA;
        }
        public String getOPSA() {
            return OPSA;
        }
        public String getOPSB() {
            return OPSB;
        }
        public String getOPSC() {
            return OPSC;
        }
        public String getPERGJIGJJA() {
            return PERGJIGJJA;
        }
        public void setID(int id)
        {
            ID=id;
        }
        public void setPYETJA(String pYETJA) {
            PYETJA = pYETJA;
        }
        public void setOPSA(String oPSA) {
            OPSA = oPSA;
        }
        public void setOPSB(String oPSB) {
            OPSB = oPSB;
        }
        public void setOPSC(String oPSC) {
            OPSC = oPSC;
        }
        public void setPERGJIGJJA(String pERGJIGJJA) {
            PERGJIGJJA = pERGJIGJJA;
        }

    }


