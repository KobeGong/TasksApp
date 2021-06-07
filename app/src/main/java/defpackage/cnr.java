package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: cnr  reason: default package */
/* compiled from: PG */
public final class cnr {
    private final File a;
    private final List b;
    private final int c;
    private final List d;

    public cnr(File file, List list, int i, Pattern... patternArr) {
        List asList;
        this.a = file;
        this.c = i;
        this.d = list;
        if (patternArr.length == 0) {
            asList = Collections.emptyList();
        } else {
            asList = Arrays.asList(patternArr);
        }
        this.b = asList;
    }

    public final long a(cns cns) {
        long j;
        String sb;
        boolean z;
        long j2 = 0;
        eew eew = new eew();
        eew.a = cns.a;
        this.d.add(eew);
        try {
            File[] listFiles = new File(cns.c.a, cns.a).listFiles();
            if (cns.b >= this.c || this.d.size() >= 512) {
                j2 = cky.a(listFiles);
                eew.c = Long.valueOf(j2);
                return j2;
            }
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file = listFiles[i];
                if (!cky.a(file)) {
                    if (file.isFile()) {
                        String name = file.getName();
                        if (cns.b == 0) {
                            sb = name;
                        } else {
                            String str = cns.a;
                            sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(name).length()).append(str).append('/').append(name).toString();
                        }
                        Iterator it = this.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((Pattern) it.next()).matcher(sb).matches()) {
                                    z = true;
                                    break;
                                }
                            } else {
                                z = false;
                                break;
                            }
                        }
                        if (z && this.d.size() < 512) {
                            eew eew2 = new eew();
                            eew2.a = sb;
                            eew2.c = Long.valueOf(file.length());
                            this.d.add(eew2);
                        }
                        j = file.length() + j2;
                    } else if (file.isDirectory()) {
                        j = a(new cns(this, cns, file.getName())) + j2;
                    }
                    i++;
                    j2 = j;
                }
                j = j2;
                i++;
                j2 = j;
            }
            eew.c = Long.valueOf(j2);
            return j2;
        } catch (IOException | SecurityException e) {
            cdm.a("DirStatsCapture", "exception while collecting DirStats for dir %s", e, cns.a);
        }
    }
}
