package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.naming.NamingEnumeration;
import javax.naming.directory.Attribute;
import javax.naming.directory.Attributes;
import javax.naming.directory.InitialDirContext;

/* renamed from: dur  reason: default package */
/* compiled from: PG */
final class dur extends dup {
    private static final Pattern a = Pattern.compile("\\s+");

    dur() {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0139  */
    @Override // defpackage.dup
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dus a(java.lang.String r15) {
        /*
        // Method dump skipped, instructions count: 469
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dur.a(java.lang.String):dus");
    }

    private static List a(String str, String str2) {
        Attributes attributes = new InitialDirContext().getAttributes(str2, new String[]{str});
        ArrayList arrayList = new ArrayList();
        NamingEnumeration all = attributes.getAll();
        while (all.hasMore()) {
            try {
                all = ((Attribute) all.next()).getAll();
                while (all.hasMore()) {
                    try {
                        arrayList.add(dum.a(String.valueOf(all.next())));
                    } finally {
                        all.close();
                    }
                }
            } finally {
                all.close();
            }
        }
        all.close();
        return arrayList;
    }
}
