package defpackage;

import android.text.TextUtils;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

/* renamed from: avk  reason: default package */
/* compiled from: PG */
public final class avk {
    private final TreeSet a = new TreeSet();
    private final List b = new ArrayList();
    private final List c = new ArrayList();
    private int d = 12;
    private int e = 16;

    public final avk a(String str) {
        this.a.addAll(a(str, "allowedChars"));
        return this;
    }

    public final avk b(String str) {
        this.b.add(PasswordSpecification.a(a(str, "requiredChars")));
        this.c.add(1);
        return this;
    }

    public final avk a() {
        this.d = 12;
        this.e = 16;
        return this;
    }

    public final PasswordSpecification b() {
        if (this.a.isEmpty()) {
            throw new avl("no allowed characters specified");
        }
        int i = 0;
        for (Integer num : this.c) {
            i = num.intValue() + i;
        }
        if (i > this.e) {
            throw new avl("required character count cannot be greater than the max password size");
        }
        boolean[] zArr = new boolean[95];
        for (String str : this.b) {
            char[] charArray = str.toCharArray();
            int length = charArray.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    char c2 = charArray[i2];
                    if (zArr[c2 - ' ']) {
                        throw new avl(new StringBuilder(58).append("character ").append(c2).append(" occurs in more than one required character set").toString());
                    }
                    zArr[c2 - ' '] = true;
                    i2++;
                }
            }
        }
        return new PasswordSpecification(PasswordSpecification.a(this.a), this.b, this.c, this.d, this.e);
    }

    private static TreeSet a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new avl(String.valueOf(str2).concat(" cannot be null or empty"));
        }
        TreeSet treeSet = new TreeSet();
        char[] charArray = str.toCharArray();
        for (char c2 : charArray) {
            if (PasswordSpecification.a(c2)) {
                throw new avl(String.valueOf(str2).concat(" must only contain ASCII printable characters"));
            }
            treeSet.add(Character.valueOf(c2));
        }
        return treeSet;
    }
}
