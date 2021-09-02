package defpackage;

/* renamed from: cnr reason: default package */
/* compiled from: PG */
public final class cnr {
    private final java.io.File a;
    private final java.util.List b;
    private final int c;
    private final java.util.List d;

    public cnr(java.io.File file, java.util.List list, int i, java.util.regex.Pattern... patternArr) {
        java.util.List asList;
        this.a = file;
        this.c = i;
        this.d = list;
        if (patternArr.length == 0) {
            asList = java.util.Collections.emptyList();
        } else {
            asList = java.util.Arrays.asList(patternArr);
        }
        this.b = asList;
    }

    public final long a(defpackage.cns cns) {
        long j;
        java.lang.String sb;
        boolean z;
        long j2 = 0;
        defpackage.eew eew = new defpackage.eew();
        eew.a = cns.a;
        this.d.add(eew);
        try {
            java.io.File[] listFiles = new java.io.File(cns.c.a, cns.a).listFiles();
            if (cns.b >= this.c || this.d.size() >= 512) {
                j2 = defpackage.cky.a(listFiles);
                eew.c = java.lang.Long.valueOf(j2);
                return j2;
            }
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                java.io.File file = listFiles[i];
                if (!defpackage.cky.a(file)) {
                    if (file.isFile()) {
                        java.lang.String name = file.getName();
                        if (cns.b == 0) {
                            sb = name;
                        } else {
                            java.lang.String str = cns.a;
                            sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 1 + java.lang.String.valueOf(name).length()).append(str).append('/').append(name).toString();
                        }
                        java.util.Iterator it = this.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((java.util.regex.Pattern) it.next()).matcher(sb).matches()) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (z && this.d.size() < 512) {
                            defpackage.eew eew2 = new defpackage.eew();
                            eew2.a = sb;
                            eew2.c = java.lang.Long.valueOf(file.length());
                            this.d.add(eew2);
                        }
                        j = file.length() + j2;
                    } else if (file.isDirectory()) {
                        j = a(new defpackage.cns(this, cns, file.getName())) + j2;
                    }
                    i++;
                    j2 = j;
                }
                j = j2;
                i++;
                j2 = j;
            }
            eew.c = java.lang.Long.valueOf(j2);
            return j2;
        } catch (java.io.IOException | java.lang.SecurityException e) {
            defpackage.cdm.a("DirStatsCapture", "exception while collecting DirStats for dir %s", e, cns.a);
        }
    }
}
