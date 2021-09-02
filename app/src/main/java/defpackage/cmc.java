package defpackage;

/* renamed from: cmc reason: default package */
/* compiled from: PG */
public final class cmc {
    private static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("^(\\*[a-z]+\\*).*");
    private final java.util.concurrent.ConcurrentHashMap b = new java.util.concurrent.ConcurrentHashMap();

    private static java.lang.String a(java.lang.String str) {
        java.lang.String[] split = str.split("/");
        if (split != null && split.length == 3) {
            return split[0];
        }
        defpackage.cdm.a(3, "HashingNameSanitizer", "malformed sync name: %s", str);
        return "MALFORMED";
    }

    cmc() {
    }

    public final void a(defpackage.cmd cmd, defpackage.egb[] egbArr) {
        java.lang.String str;
        if (egbArr != null) {
            for (defpackage.egb egb : egbArr) {
                if (!(egb == null || egb.c == null || egb.c.b == null)) {
                    defpackage.eed eed = egb.c;
                    java.lang.String str2 = egb.c.b;
                    long longValue = defpackage.chs.a(str2).longValue();
                    if (!this.b.containsKey(java.lang.Long.valueOf(longValue))) {
                        switch (cmd.ordinal()) {
                            case 0:
                                java.util.regex.Matcher matcher = a.matcher(str2);
                                if (matcher.matches()) {
                                    if (!str2.startsWith("*sync*/")) {
                                        str = matcher.group(1);
                                        defpackage.cdm.a(3, "HashingNameSanitizer", "non-sync system task wakelock: %s", str);
                                        break;
                                    } else {
                                        java.lang.String valueOf = java.lang.String.valueOf("*sync*/");
                                        java.lang.String valueOf2 = java.lang.String.valueOf(a(str2.substring(7)));
                                        if (valueOf2.length() == 0) {
                                            str = new java.lang.String(valueOf);
                                            break;
                                        } else {
                                            str = valueOf.concat(valueOf2);
                                            break;
                                        }
                                    }
                                } else {
                                    defpackage.cdm.a(3, "HashingNameSanitizer", "wakelock: %s", str2);
                                    str = str2;
                                    break;
                                }
                            case 1:
                                str = a(str2);
                                break;
                            case 2:
                                str = "--";
                                break;
                            default:
                                str = str2;
                                break;
                        }
                        java.lang.Long a2 = defpackage.chs.a(str);
                        defpackage.cdm.a(3, "HashingNameSanitizer", "Sanitized Hash: [%s] %s -> %s", cmd, str, a2);
                        defpackage.cdm.a(2, "HashingNameSanitizer", "Raw Hash: [%s] %s -> %s", cmd, str2, java.lang.Long.valueOf(longValue));
                        this.b.putIfAbsent(java.lang.Long.valueOf(longValue), a2);
                    }
                    eed.a = java.lang.Long.valueOf(longValue);
                    egb.c.b = null;
                }
            }
        }
    }

    public final void a(defpackage.egb[] egbArr) {
        if (egbArr != null) {
            for (defpackage.egb egb : egbArr) {
                if (!(egb == null || egb.c == null || egb.c.a == null)) {
                    egb.c.a = (java.lang.Long) this.b.get(egb.c.a);
                }
            }
        }
    }
}
