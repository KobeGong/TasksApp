package defpackage;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* renamed from: av  reason: default package */
/* compiled from: PG */
public final class av implements Serializable {
    public static final Pattern b = Pattern.compile("\\s*,\\s*");
    public static final Pattern c = Pattern.compile("\\s*~\\s*");
    private static final az d = new aw();
    private static final bi e = new bi("other", d, null, null);
    private static final av f = new av(new bj().a(e));
    private static final Pattern g = Pattern.compile("\\s*\\Q\\E@\\s*");
    private static final Pattern h = Pattern.compile("\\s*or\\s*");
    private static final Pattern i = Pattern.compile("\\s*and\\s*");
    private static final Pattern j = Pattern.compile("\\s*;\\s*");
    public static final long serialVersionUID = 1;
    public final bj a;

    /* JADX WARN: Type inference failed for: r2v11, types: [boolean, byte] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.av a(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 136
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av.a(java.lang.String):av");
    }

    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0234 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.az b(java.lang.String r30) {
        /*
        // Method dump skipped, instructions count: 857
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av.b(java.lang.String):az");
    }

    private static ParseException a(String str, String str2) {
        return new ParseException(new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length()).append("unexpected token '").append(str).append("' in '").append(str2).append("'").toString(), -1);
    }

    private static String a(String[] strArr, int i2, String str) {
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        throw new ParseException(new StringBuilder(String.valueOf(str).length() + 26).append("missing token at end of '").append(str).append("'").toString(), -1);
    }

    private static bi c(String str) {
        boolean z;
        bd a2;
        az b2;
        bd bdVar = null;
        boolean z2 = true;
        if (str.length() == 0) {
            return e;
        }
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int indexOf = lowerCase.indexOf(58);
        if (indexOf == -1) {
            throw new ParseException(new StringBuilder(String.valueOf(lowerCase).length() + 34).append("missing ':' in rule description '").append(lowerCase).append("'").toString(), 0);
        }
        String trim = lowerCase.substring(0, indexOf).trim();
        int i2 = 0;
        while (true) {
            if (i2 >= trim.length()) {
                z = true;
                break;
            }
            char charAt = trim.charAt(i2);
            if ('a' > charAt || charAt > 'z') {
                z = false;
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            throw new ParseException(new StringBuilder(String.valueOf(trim).length() + 22).append("keyword '").append(trim).append(" is not valid").toString(), 0);
        }
        String trim2 = lowerCase.substring(indexOf + 1).trim();
        String[] split = g.split(trim2);
        switch (split.length) {
            case 1:
                a2 = null;
                break;
            case 2:
                a2 = bd.a(split[1]);
                if (a2.a != bg.d) {
                    bdVar = a2;
                    a2 = null;
                    break;
                }
                break;
            case 3:
                bdVar = bd.a(split[1]);
                a2 = bd.a(split[2]);
                if (!(bdVar.a == bg.c && a2.a == bg.d)) {
                    String valueOf = String.valueOf(trim2);
                    throw new IllegalArgumentException(valueOf.length() != 0 ? "Must have @integer then @decimal in ".concat(valueOf) : new String("Must have @integer then @decimal in "));
                }
            default:
                String valueOf2 = String.valueOf(trim2);
                throw new IllegalArgumentException(valueOf2.length() != 0 ? "Too many samples in ".concat(valueOf2) : new String("Too many samples in "));
        }
        boolean equals = trim.equals("other");
        if (split[0].length() != 0) {
            z2 = false;
        }
        if (equals != z2) {
            throw new IllegalArgumentException("The keyword 'other' must have no constraints, just samples.");
        }
        if (equals) {
            b2 = d;
        } else {
            b2 = b(split[0]);
        }
        return new bi(trim, b2, bdVar, a2);
    }

    /* access modifiers changed from: private */
    public static void b(StringBuilder sb, double d2, double d3, boolean z) {
        if (z) {
            sb.append(",");
        }
        if (d2 == d3) {
            sb.append(a(d2));
            return;
        }
        String a2 = a(d2);
        String a3 = a(d3);
        sb.append(new StringBuilder(String.valueOf(a2).length() + 2 + String.valueOf(a3).length()).append(a2).append("..").append(a3).toString());
    }

    private static String a(double d2) {
        long j2 = (long) d2;
        return d2 == ((double) j2) ? String.valueOf(j2) : String.valueOf(d2);
    }

    public static av a(Locale locale, int i2) {
        Map emptyMap;
        Map emptyMap2;
        boolean z = true;
        bk bkVar = bk.f;
        synchronized (bkVar) {
            if (bkVar.d == null) {
                z = false;
            }
        }
        if (!z) {
            try {
                ResourceBundle resourceBundle = bk.c;
                Object[][] objArr = (Object[][]) resourceBundle.getObject("locales");
                TreeMap treeMap = new TreeMap();
                for (Object[] objArr2 : objArr) {
                    treeMap.put((String) objArr2[0], (String) objArr2[1]);
                }
                Object[][] objArr3 = (Object[][]) resourceBundle.getObject("locales_ordinals");
                TreeMap treeMap2 = new TreeMap();
                for (Object[] objArr4 : objArr3) {
                    treeMap2.put((String) objArr4[0], (String) objArr4[1]);
                }
                emptyMap2 = treeMap2;
                emptyMap = treeMap;
            } catch (MissingResourceException e2) {
                emptyMap = Collections.emptyMap();
                emptyMap2 = Collections.emptyMap();
            }
            synchronized (bkVar) {
                if (bkVar.d == null) {
                    bkVar.d = emptyMap;
                    bkVar.e = emptyMap2;
                }
            }
        }
        String str = (String) (i2 == bg.a ? bkVar.d : bkVar.e).get(locale.getLanguage());
        if (str == null || str.trim().length() == 0) {
            return f;
        }
        av a2 = bkVar.a(str);
        if (a2 == null) {
            return f;
        }
        return a2;
    }

    private av(bj bjVar) {
        this.a = bjVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (bi biVar : bjVar.b) {
            linkedHashSet.add(biVar.a);
        }
        Collections.unmodifiableSet(linkedHashSet);
    }

    @Deprecated
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj instanceof av) {
            av avVar = (av) obj;
            if (avVar == null || !toString().equals(avVar.toString())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    static {
        Pattern.compile("\\s*\\Q..\\E\\s*");
    }
}
