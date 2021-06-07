package defpackage;

import java.util.Iterator;

/* renamed from: ebi  reason: default package */
/* compiled from: PG */
public abstract class ebi {
    /* access modifiers changed from: protected */
    public abstract Iterator a();

    public String toString() {
        return "TagContext";
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 130
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    public boolean equals(java.lang.Object r8) {
        /*
        // Method dump skipped, instructions count: 123
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebi.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 0;
        Iterator a = a();
        if (a == null) {
            return 0;
        }
        while (a.hasNext()) {
            ebh ebh = (ebh) a.next();
            if (ebh != null) {
                i = ebh.hashCode() + i;
            } else {
                i = i;
            }
        }
        return i;
    }
}
