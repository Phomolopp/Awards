
public class Person {

    private String name;
    private int gold;
    private int silver;
    private int bronze;
    private int com;
    private int cw;
    private int cw_com;
    //0 - Bronze, 1 - Silver, 2 - Gold, 3 - COM, 4 - CW, 5 - CW_COM
    private int[] setSubject = new int[6];
    private int[] open = new int[6];
    private int[] nature = new int[6];
    private int[] scapes = new int[6];
    private int[] doc = new int[6];
    private int[] por = new int[6];

    public Person() {
    }

    public Person(String name) {
        this.name = name;
        gold = 0;
        silver = 0;
        bronze = 0;
        com = 0;
        cw = 0;
        cw_com = 0;
        for (int x = 0; x < 6; x++) {
            setSubject[x] = 0;
            open[x] = 0;
            nature[x] = 0;
            scapes[x] = 0;
            doc[x] = 0;
            por[x] = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getBronze() {
        return bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    public int getCom() {
        return com;
    }

    public void setCom(int com) {
        this.com = com;
    }

    public int getCw() {
        return cw;
    }

    public void setCw(int cw) {
        this.cw = cw;
    }

    public int getCw_com() {
        return cw_com;
    }

    public void setCw_com(int cw_com) {
        this.cw_com = cw_com;
    }

    public int[] getSetSubject() {
        return setSubject;
    }

    public void setSetSubject(int[] setSubject) {
        this.setSubject = setSubject;
    }

    public int[] getOpen() {
        return open;
    }

    public void setOpen(int[] open) {
        this.open = open;
    }

    public int[] getNature() {
        return nature;
    }

    public void setNature(int[] nature) {
        this.nature = nature;
    }

    public int[] getScapes() {
        return scapes;
    }

    public void setScapes(int[] scapes) {
        this.scapes = scapes;
    }

    public int[] getDoc() {
        return doc;
    }

    public void setDoc(int[] doc) {
        this.doc = doc;
    }

    public int[] getPor() {
        return por;
    }

    public void setPor(int[] por) {
        this.por = por;
    }

    public void increaseAward(String award, String photoName) {
        if (award.equals("Bronze"))
        {
            bronze++;
            if (photoName.startsWith("SS")) {
                setSubject[0]++;
            } else if (photoName.startsWith("OP")) {
                open[0]++;
            } else if (photoName.startsWith("NA")) {
                nature[0]++;
            } else if (photoName.startsWith("SC")) {
                scapes[0]++;
            } else if (photoName.startsWith("DO")) {
                doc[0]++;
            } else if (photoName.startsWith("PO")) {
                por[0]++;
            }
        }
        if (award.equals("Silver")) 
        {
            silver++;
            if (photoName.startsWith("SS")) {
                setSubject[1]++;
            } else if (photoName.startsWith("OP")) {
                open[1]++;
            } else if (photoName.startsWith("NA")) {
                nature[1]++;
            } else if (photoName.startsWith("SC")) {
                scapes[1]++;
            } else if (photoName.startsWith("DO")) {
                doc[1]++;
            } else if (photoName.startsWith("PO")) {
                por[1]++;
            }
        }
        if (award.equals("Gold")) 
        {
            gold++;
            if (photoName.startsWith("SS")) {
                setSubject[2]++;
            } else if (photoName.startsWith("OP")) {
                open[2]++;
            } else if (photoName.startsWith("NA")) {
                nature[2]++;
            } else if (photoName.startsWith("SC")) {
                scapes[2]++;
            } else if (photoName.startsWith("DO")) {
                doc[2]++;
            } else if (photoName.startsWith("PO")) {
                por[2]++;
            }
        }
        if (award.equals("CW")) 
        {
            cw++;
            if (photoName.startsWith("SS")) {
                setSubject[3]++;
            } else if (photoName.startsWith("OP")) {
                open[3]++;
            } else if (photoName.startsWith("NA")) {
                nature[3]++;
            } else if (photoName.startsWith("SC")) {
                scapes[3]++;
            } else if (photoName.startsWith("DO")) {
                doc[3]++;
            } else if (photoName.startsWith("PO")) {
                por[3]++;
            }
        }
        if (award.equals("COM")) 
        {
            com++;
            if (photoName.startsWith("SS")) {
                setSubject[4]++;
            } else if (photoName.startsWith("OP")) {
                open[4]++;
            } else if (photoName.startsWith("NA")) {
                nature[4]++;
            } else if (photoName.startsWith("SC")) {
                scapes[4]++;
            } else if (photoName.startsWith("DO")) {
                doc[4]++;
            } else if (photoName.startsWith("PO")) {
                por[4]++;
            }
        }
        if (award.equals("CW_COM")) 
        {
            cw_com++;
            if (photoName.startsWith("SS")) {
                setSubject[5]++;
            } else if (photoName.startsWith("OP")) {
                open[5]++;
            } else if (photoName.startsWith("NA")) {
                nature[5]++;
            } else if (photoName.startsWith("SC")) {
                scapes[5]++;
            } else if (photoName.startsWith("DO")) {
                doc[5]++;
            } else if (photoName.startsWith("PO")) {
                por[5]++;
            }
        }
    }
}

