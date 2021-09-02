package defpackage;

/* renamed from: bk reason: default package */
/* compiled from: PG */
public final class bk extends defpackage.ba {
    public static final java.util.ResourceBundle c = new defpackage.aq();
    public static final defpackage.bk f = new defpackage.bk();
    public java.util.Map d;
    public java.util.Map e;
    private final java.util.Map g = new java.util.HashMap();

    private bk() {
    }

    public final defpackage.av a(java.lang.String str) {
        boolean containsKey;
        defpackage.av avVar;
        defpackage.av avVar2;
        defpackage.av avVar3;
        java.lang.Object[] objArr = null;
        synchronized (this.g) {
            containsKey = this.g.containsKey(str);
            if (containsKey) {
                avVar = (defpackage.av) this.g.get(str);
            } else {
                avVar = null;
            }
        }
        if (!containsKey) {
            try {
                java.lang.Object[][] objArr2 = (java.lang.Object[][]) c.getObject("rules");
                int length = objArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    java.lang.Object[] objArr3 = objArr2[i];
                    if (str.equals(objArr3[0])) {
                        objArr = (java.lang.Object[][]) objArr3[1];
                        break;
                    }
                    i++;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                for (java.lang.String[] strArr : objArr) {
                    if (sb.length() > 0) {
                        sb.append("; ");
                    }
                    sb.append(strArr[0]);
                    sb.append(": ");
                    sb.append(strArr[1]);
                }
                avVar3 = defpackage.av.a(sb.toString());
            } catch (java.text.ParseException e2) {
                avVar3 = avVar2;
            } catch (java.util.MissingResourceException e3) {
                avVar3 = avVar2;
            }
            synchronized (this.g) {
                if (this.g.containsKey(str)) {
                    avVar2 = (defpackage.av) this.g.get(str);
                } else {
                    this.g.put(str, avVar3);
                    avVar2 = avVar3;
                }
            }
        }
        return avVar2;
    }
}
