package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: cmc  reason: default package */
/* compiled from: PG */
public final class cmc {
    private static final Pattern a = Pattern.compile("^(\\*[a-z]+\\*).*");
    private final ConcurrentHashMap b = new ConcurrentHashMap();

    private static String a(String str) {
        String[] split = str.split("/");
        if (split != null && split.length == 3) {
            return split[0];
        }
        cdm.a(3, "HashingNameSanitizer", "malformed sync name: %s", str);
        return "MALFORMED";
    }

    cmc() {
    }

    public final void a(cmd cmd, egb[] egbArr) {
        String str;
        if (egbArr != null) {
            for (egb egb : egbArr) {
                if (!(egb == null || egb.c == null || egb.c.b == null)) {
                    eed eed = egb.c;
                    String str2 = egb.c.b;
                    long longValue = chs.a(str2).longValue();
                    if (!this.b.containsKey(Long.valueOf(longValue))) {
                        switch (cmd.ordinal()) {
                            case 0:
                                Matcher matcher = a.matcher(str2);
                                if (matcher.matches()) {
                                    if (str2.startsWith("*sync*/")) {
                                        String valueOf = String.valueOf("*sync*/");
                                        String valueOf2 = String.valueOf(a(str2.substring(7)));
                                        if (valueOf2.length() != 0) {
                                            str = valueOf.concat(valueOf2);
                                            break;
                                        } else {
                                            str = new String(valueOf);
                                            break;
                                        }
                                    } else {
                                        str = matcher.group(1);
                                        cdm.a(3, "HashingNameSanitizer", "non-sync system task wakelock: %s", str);
                                        break;
                                    }
                                } else {
                                    cdm.a(3, "HashingNameSanitizer", "wakelock: %s", str2);
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
                        Long a2 = chs.a(str);
                        cdm.a(3, "HashingNameSanitizer", "Sanitized Hash: [%s] %s -> %s", cmd, str, a2);
                        cdm.a(2, "HashingNameSanitizer", "Raw Hash: [%s] %s -> %s", cmd, str2, Long.valueOf(longValue));
                        this.b.putIfAbsent(Long.valueOf(longValue), a2);
                    }
                    eed.a = Long.valueOf(longValue);
                    egb.c.b = null;
                }
            }
        }
    }

    public final void a(egb[] egbArr) {
        if (egbArr != null) {
            for (egb egb : egbArr) {
                if (!(egb == null || egb.c == null || egb.c.a == null)) {
                    egb.c.a = (Long) this.b.get(egb.c.a);
                }
            }
        }
    }
}
