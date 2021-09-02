package defpackage;

/* renamed from: buu reason: default package */
/* compiled from: PG */
public final class buu {
    public android.content.Context a;
    public defpackage.bup b;
    private final java.util.HashMap c = new java.util.HashMap();

    public final synchronized java.util.List a(java.lang.String str, int i) {
        return a(str, "job_type=?", java.lang.Integer.toString(i));
    }

    public final synchronized defpackage.bus a(java.lang.String str, int i, byte[] bArr) {
        defpackage.bus bus = null;
        synchronized (this) {
            try {
                android.content.ContentValues contentValues = new android.content.ContentValues(2);
                contentValues.put("job_type", java.lang.Integer.valueOf(i));
                contentValues.put("payload", bArr);
                long insert = b(str).getWritableDatabase().insert("tasks", null, contentValues);
                if (insert > 0) {
                    bus = new defpackage.but().a(java.lang.Long.valueOf(insert)).a(java.lang.Integer.valueOf(i)).a(bArr).a();
                }
            } catch (defpackage.buo | java.lang.RuntimeException e) {
                defpackage.bty.b("ChimeTaskDataStorageImpl", e, "Error inserting ChimeTaskData %d for account: %s", java.lang.Integer.valueOf(i), str);
            }
        }
        return bus;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<bus>, for r10v0, types: [java.util.List, java.util.List<bus>] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(java.lang.String r9, java.util.List<defpackage.bus> r10) {
        /*
            r8 = this;
            r0 = 0
            monitor-enter(r8)
            boolean r1 = r10.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x000a
        L_0x0008:
            monitor-exit(r8)
            return r0
        L_0x000a:
            int r1 = r10.size()     // Catch:{ all -> 0x0042 }
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x0042 }
            java.util.Iterator r4 = r10.iterator()     // Catch:{ all -> 0x0042 }
            r1 = r0
        L_0x0015:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0042 }
            bus r0 = (defpackage.bus) r0     // Catch:{ all -> 0x0042 }
            int r2 = r1 + 1
            java.lang.Long r0 = r0.a()     // Catch:{ all -> 0x0042 }
            long r6 = r0.longValue()     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = java.lang.Long.toString(r6)     // Catch:{ all -> 0x0042 }
            r3[r1] = r0     // Catch:{ all -> 0x0042 }
            r1 = r2
            goto L_0x0015
        L_0x0033:
            java.lang.String r0 = "_id"
            int r1 = r10.size()     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = defpackage.bvh.a(r0, r1)     // Catch:{ all -> 0x0042 }
            boolean r0 = r8.b(r9, r0, r3)     // Catch:{ all -> 0x0042 }
            goto L_0x0008
        L_0x0042:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buu.a(java.lang.String, java.util.List):boolean");
    }

    public final synchronized boolean a(java.lang.String str) {
        return b(str, null, null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List a(java.lang.String r12, java.lang.String r13, java.lang.String... r14) {
        /*
            r11 = this;
            r9 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            bvd r0 = r11.b(r12)     // Catch:{ RuntimeException -> 0x008f, buo -> 0x0092, all -> 0x0085 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch:{ RuntimeException -> 0x008f, buo -> 0x0092, all -> 0x0085 }
            java.lang.String r1 = "tasks"
            r2 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "_id ASC"
            r8 = 0
            r3 = r13
            r4 = r14
            android.database.Cursor r1 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x008f, buo -> 0x0092, all -> 0x0085 }
        L_0x001c:
            boolean r0 = r1.moveToNext()     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            if (r0 == 0) goto L_0x007f
            but r0 = new but     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            r0.<init>()     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            java.lang.String r2 = "_id"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            long r2 = r1.getLong(r2)     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            but r0 = r0.a(r2)     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            java.lang.String r2 = "job_type"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            int r2 = r1.getInt(r2)     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            but r0 = r0.a(r2)     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            java.lang.String r2 = "payload"
            int r2 = r1.getColumnIndex(r2)     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            byte[] r2 = r1.getBlob(r2)     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            but r0 = r0.a(r2)     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            bus r0 = r0.a()     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            r10.add(r0)     // Catch:{ RuntimeException -> 0x0061, buo -> 0x0095 }
            goto L_0x001c
        L_0x0061:
            r0 = move-exception
        L_0x0062:
            java.lang.String r2 = "ChimeTaskDataStorageImpl"
            java.lang.String r3 = "Error getting ChimeTaskData for account: %s. Query: %s %s"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x008d }
            r5 = 0
            r4[r5] = r12     // Catch:{ all -> 0x008d }
            r5 = 1
            r4[r5] = r13     // Catch:{ all -> 0x008d }
            r5 = 2
            java.lang.String r6 = java.util.Arrays.toString(r14)     // Catch:{ all -> 0x008d }
            r4[r5] = r6     // Catch:{ all -> 0x008d }
            defpackage.bty.b(r2, r0, r3, r4)     // Catch:{ all -> 0x008d }
            if (r1 == 0) goto L_0x007e
            r1.close()
        L_0x007e:
            return r10
        L_0x007f:
            if (r1 == 0) goto L_0x007e
            r1.close()
            goto L_0x007e
        L_0x0085:
            r0 = move-exception
            r1 = r9
        L_0x0087:
            if (r1 == 0) goto L_0x008c
            r1.close()
        L_0x008c:
            throw r0
        L_0x008d:
            r0 = move-exception
            goto L_0x0087
        L_0x008f:
            r0 = move-exception
            r1 = r9
            goto L_0x0062
        L_0x0092:
            r0 = move-exception
            r1 = r9
            goto L_0x0062
        L_0x0095:
            r0 = move-exception
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.buu.a(java.lang.String, java.lang.String, java.lang.String[]):java.util.List");
    }

    private final boolean b(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        try {
            if (b(str).getWritableDatabase().delete("tasks", str2, strArr) > 0) {
                return true;
            }
            return false;
        } catch (defpackage.buo | java.lang.RuntimeException e) {
            defpackage.bty.b("ChimeTaskDataStorageImpl", e, "Error deleting ChimeTaskData for account: %s", str);
            return false;
        }
    }

    private final synchronized defpackage.bvd b(java.lang.String str) {
        java.lang.Long valueOf;
        valueOf = java.lang.Long.valueOf(-1);
        if (!android.text.TextUtils.isEmpty(str)) {
            valueOf = this.b.a(str).a();
        }
        if (!this.c.containsKey(valueOf)) {
            this.c.put(valueOf, new defpackage.bvd(this.a, valueOf.longValue()));
        }
        return (defpackage.bvd) this.c.get(valueOf);
    }
}
