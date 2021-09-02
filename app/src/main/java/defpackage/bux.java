package defpackage;

/* renamed from: bux reason: default package */
/* compiled from: PG */
public final class bux {
    public android.content.Context a;
    public defpackage.bup b;
    private final java.util.HashMap c = new java.util.HashMap();

    public final synchronized java.util.List a(java.lang.String str) {
        return a(str, (java.lang.String) null, (java.lang.String[]) null);
    }

    public final synchronized java.util.List a(java.lang.String str, java.lang.String... strArr) {
        return a(str, defpackage.bvh.a("thread_id", strArr.length), strArr);
    }

    public final synchronized boolean b(java.lang.String str) {
        return b(str, (java.lang.String) null, (java.lang.String[]) null);
    }

    public final synchronized boolean b(java.lang.String str, java.lang.String... strArr) {
        return b(str, defpackage.bvh.a("thread_id", strArr.length), strArr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00d7 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011a A[SYNTHETIC, Splitter:B:40:0x011a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(java.lang.String r13, defpackage.buv r14) {
        /*
            r12 = this;
            r7 = 0
            r8 = 0
            monitor-enter(r12)
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r2 = 12
            r9.<init>(r2)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r2 = "thread_id"
            java.lang.String r3 = r14.a()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r9.put(r2, r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r2 = "read_state"
            dge r3 = r14.b()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r3 = r3.d     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r9.put(r2, r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r2 = "count_behavior"
            dfu r3 = r14.c()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r3 = r3.d     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r9.put(r2, r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r2 = "system_tray_behavior"
            dgj r3 = r14.d()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r3 = r3.d     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r9.put(r2, r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r2 = "last_updated__version"
            java.lang.Long r3 = r14.e()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r9.put(r2, r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r2 = "last_notification_version"
            java.lang.Long r3 = r14.f()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r9.put(r2, r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r2 = "update_thread_state_token"
            java.lang.String r3 = r14.j()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r9.put(r2, r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r2 = "group_id"
            java.lang.String r3 = r14.k()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r9.put(r2, r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r2 = "expiration_timestamp"
            java.lang.Long r3 = r14.l()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r9.put(r2, r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dfn r2 = r14.g()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r2 == 0) goto L_0x0080
            java.lang.String r2 = "rendered_message"
            dfn r3 = r14.g()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            byte[] r3 = r3.b()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r9.put(r2, r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x0080:
            java.util.List r2 = r14.h()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r2 == 0) goto L_0x0261
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.util.List r2 = r14.h()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r2 = r2.size()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r4.<init>(r2)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.util.List r2 = r14.h()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.util.Iterator r5 = r2.iterator()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x009b:
            boolean r2 = r5.hasNext()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r2 == 0) goto L_0x0121
            java.lang.Object r2 = r5.next()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dfz r2 = (defpackage.dfz) r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dgu r3 = defpackage.dgu.b     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r6 = defpackage.bg.ao     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.Object r3 = r3.a(r6)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dii r3 = (defpackage.dii) r3     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dha r6 = r2.a()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r3.b()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dih r2 = r3.a     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dgu r2 = (defpackage.dgu) r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r6 != 0) goto L_0x00de
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r2.<init>()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            throw r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x00c4:
            r2 = move-exception
        L_0x00c5:
            java.lang.String r3 = "ChimeThreadStorageImpl"
            java.lang.String r4 = "Error inserting ChimeThread for account: %s, %s"
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0117 }
            r6 = 0
            r5[r6] = r13     // Catch:{ all -> 0x0117 }
            r6 = 1
            r5[r6] = r14     // Catch:{ all -> 0x0117 }
            defpackage.bty.b(r3, r2, r4, r5)     // Catch:{ all -> 0x0117 }
            if (r7 == 0) goto L_0x00da
            r7.close()     // Catch:{ all -> 0x011e }
        L_0x00da:
            int r2 = defpackage.bg.X     // Catch:{ all -> 0x011e }
        L_0x00dc:
            monitor-exit(r12)
            return r2
        L_0x00de:
            r2.a = r6     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            boolean r2 = r3.b     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r2 == 0) goto L_0x00fe
            dih r2 = r3.a     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x00e6:
            dih r2 = (defpackage.dih) r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            boolean r3 = r3.booleanValue()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            boolean r3 = defpackage.dih.a(r2, r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r3 != 0) goto L_0x010f
            dkw r2 = new dkw     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r2.<init>()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            throw r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x00fa:
            r2 = move-exception
            r3 = r7
        L_0x00fc:
            r7 = r3
            goto L_0x00c5
        L_0x00fe:
            dih r2 = r3.a     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            djz r6 = defpackage.djz.a     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dkh r6 = r6.a(r2)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r6.c(r2)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r2 = 1
            r3.b = r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dih r2 = r3.a     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            goto L_0x00e6
        L_0x010f:
            dih r2 = (defpackage.dih) r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dgu r2 = (defpackage.dgu) r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r4.add(r2)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            goto L_0x009b
        L_0x0117:
            r2 = move-exception
        L_0x0118:
            if (r7 == 0) goto L_0x011d
            r7.close()     // Catch:{ all -> 0x011e }
        L_0x011d:
            throw r2     // Catch:{ all -> 0x011e }
        L_0x011e:
            r2 = move-exception
            monitor-exit(r12)
            throw r2
        L_0x0121:
            java.lang.String r10 = "notification_metadata"
            cbr r2 = defpackage.cbr.b     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r3 = defpackage.bg.ao     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.Object r2 = r2.a(r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dii r2 = (defpackage.dii) r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r2.b()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dih r3 = r2.a     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            cbr r3 = (defpackage.cbr) r3     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            diq r5 = r3.a     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            boolean r5 = r5.a()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r5 != 0) goto L_0x014c
            diq r6 = r3.a     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r5 = r6.size()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r5 != 0) goto L_0x01a3
            r5 = 10
        L_0x0146:
            diq r5 = r6.a(r5)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r3.a = r5     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x014c:
            diq r5 = r3.a     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            defpackage.dim.a(r4)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            boolean r3 = r4 instanceof defpackage.diz     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r3 == 0) goto L_0x01bc
            r0 = r4
            diz r0 = (defpackage.diz) r0     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r3 = r0
            java.util.List r4 = r3.d()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r0 = r5
            diz r0 = (defpackage.diz) r0     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r3 = r0
            int r5 = r5.size()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.util.Iterator r6 = r4.iterator()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x0169:
            boolean r4 = r6.hasNext()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r4 == 0) goto L_0x01c5
            java.lang.Object r4 = r6.next()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r4 != 0) goto L_0x01ac
            int r2 = r3.size()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r2 = r2 - r5
            r4 = 37
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r6.<init>(r4)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r4 = "Element at index "
            java.lang.StringBuilder r4 = r6.append(r4)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r4 = " is null."
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r4 = r2.toString()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r2 = r3.size()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r2 = r2 + -1
        L_0x019b:
            if (r2 < r5) goto L_0x01a6
            r3.remove(r2)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r2 = r2 + -1
            goto L_0x019b
        L_0x01a3:
            int r5 = r5 << 1
            goto L_0x0146
        L_0x01a6:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r2.<init>(r4)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            throw r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x01ac:
            boolean r8 = r4 instanceof defpackage.dha     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r8 == 0) goto L_0x01b6
            dha r4 = (defpackage.dha) r4     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r3.a(r4)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            goto L_0x0169
        L_0x01b6:
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r3.add(r4)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            goto L_0x0169
        L_0x01bc:
            boolean r3 = r4 instanceof defpackage.djy     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r3 == 0) goto L_0x01df
            java.util.Collection r4 = (java.util.Collection) r4     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r5.addAll(r4)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x01c5:
            boolean r3 = r2.b     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r3 == 0) goto L_0x0244
            dih r2 = r2.a     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x01cb:
            dih r2 = (defpackage.dih) r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            boolean r3 = r3.booleanValue()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            boolean r3 = defpackage.dih.a(r2, r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r3 != 0) goto L_0x0256
            dkw r2 = new dkw     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r2.<init>()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            throw r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x01df:
            boolean r3 = r5 instanceof java.util.ArrayList     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r3 == 0) goto L_0x01f7
            r0 = r5
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r3 = r0
            int r11 = r5.size()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r6 = r0
            int r6 = r6.size()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r6 = r6 + r11
            r3.ensureCapacity(r6)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x01f7:
            int r6 = r5.size()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r11 = r4.size()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r3 = r8
        L_0x0202:
            if (r3 >= r11) goto L_0x01c5
            java.lang.Object r8 = r4.get(r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r3 = r3 + 1
            if (r8 != 0) goto L_0x0240
            int r2 = r5.size()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r2 = r2 - r6
            r3 = 37
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r4.<init>(r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r3 = "Element at index "
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r3 = " is null."
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r3 = r2.toString()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r2 = r5.size()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r2 = r2 + -1
        L_0x0232:
            if (r2 < r6) goto L_0x023a
            r5.remove(r2)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            int r2 = r2 + -1
            goto L_0x0232
        L_0x023a:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r2.<init>(r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            throw r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x0240:
            r5.add(r8)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            goto L_0x0202
        L_0x0244:
            dih r3 = r2.a     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            djz r4 = defpackage.djz.a     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dkh r4 = r4.a(r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r4.c(r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r3 = 1
            r2.b = r3     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            dih r2 = r2.a     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            goto L_0x01cb
        L_0x0256:
            dih r2 = (defpackage.dih) r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            cbr r2 = (defpackage.cbr) r2     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            byte[] r2 = r2.b()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r9.put(r10, r2)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x0261:
            dgu r2 = r14.i()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            if (r2 == 0) goto L_0x0274
            java.lang.String r2 = "payload"
            dgu r3 = r14.i()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            byte[] r3 = r3.b()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            r9.put(r2, r3)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
        L_0x0274:
            bvf r2 = r12.c(r13)     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            android.database.sqlite.SQLiteDatabase r3 = r2.getWritableDatabase()     // Catch:{ RuntimeException -> 0x00c4, buo -> 0x00fa }
            java.lang.String r2 = "threads"
            r4 = 0
            r5 = 4
            long r4 = r3.insertWithOnConflict(r2, r4, r9, r5)     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L_0x0293
            int r2 = defpackage.bg.U     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            if (r3 == 0) goto L_0x00dc
            r3.close()     // Catch:{ all -> 0x011e }
            goto L_0x00dc
        L_0x0293:
            java.lang.String r2 = "%s = ? AND %s < ?"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            r5 = 0
            java.lang.String r6 = "thread_id"
            r4[r5] = r6     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            r5 = 1
            java.lang.String r6 = "last_updated__version"
            r4[r5] = r6     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            java.lang.String r2 = java.lang.String.format(r2, r4)     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            r5 = 0
            java.lang.String r6 = r14.a()     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            r4[r5] = r6     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            r5 = 1
            java.lang.Long r6 = r14.e()     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            long r6 = r6.longValue()     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            java.lang.String r6 = java.lang.Long.toString(r6)     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            r4[r5] = r6     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            java.lang.String r5 = "threads"
            int r2 = r3.update(r5, r9, r2, r4)     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            if (r2 <= 0) goto L_0x02d0
            int r2 = defpackage.bg.V     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
        L_0x02c9:
            if (r3 == 0) goto L_0x00dc
            r3.close()     // Catch:{ all -> 0x011e }
            goto L_0x00dc
        L_0x02d0:
            int r2 = defpackage.bg.W     // Catch:{ RuntimeException -> 0x02d7, buo -> 0x02db, all -> 0x02d3 }
            goto L_0x02c9
        L_0x02d3:
            r2 = move-exception
            r7 = r3
            goto L_0x0118
        L_0x02d7:
            r2 = move-exception
            r7 = r3
            goto L_0x00c5
        L_0x02db:
            r2 = move-exception
            goto L_0x00fc
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bux.a(java.lang.String, buv):int");
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1 */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: type inference failed for: r1v17 */
    /* JADX WARNING: type inference failed for: r1v42 */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00e7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00e8, code lost:
        r10 = r1;
        r1 = r9;
        r9 = r0;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0123, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0128, code lost:
        r9.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0138, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0139, code lost:
        r10 = r1;
        r1 = r9;
        r9 = r0;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0149, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x014a, code lost:
        r10 = r1;
        r1 = r0;
        r0 = r10;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x010f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0149 A[ExcHandler: buo (r1v8 'e' buo A[CUSTOM_DECLARE]), Splitter:B:4:0x0013] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(java.lang.String r12, java.lang.String r13, java.lang.String[] r14) {
        /*
            r11 = this;
            r9 = 0
            bvf r0 = r11.c(r12)     // Catch:{ RuntimeException -> 0x0140, buo -> 0x012c, all -> 0x011f }
            android.database.sqlite.SQLiteDatabase r0 = r0.getWritableDatabase()     // Catch:{ RuntimeException -> 0x0140, buo -> 0x012c, all -> 0x011f }
            java.lang.String r1 = "threads"
            r2 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "last_notification_version DESC"
            r8 = 0
            r3 = r13
            r4 = r14
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x0143, buo -> 0x0149, all -> 0x0132 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            r2.<init>()     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
        L_0x001c:
            boolean r1 = r9.moveToNext()     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            if (r1 == 0) goto L_0x0113
            buw r1 = defpackage.buv.m()     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r3 = "thread_id"
            int r3 = r9.getColumnIndex(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r3 = r9.getString(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            buw r1 = r1.a(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r3 = "read_state"
            int r3 = r9.getColumnIndex(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            int r3 = r9.getInt(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            dge r3 = defpackage.dge.a(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            buw r1 = r1.a(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r3 = "count_behavior"
            int r3 = r9.getColumnIndex(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            int r3 = r9.getInt(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            dfu r3 = defpackage.dfu.a(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            buw r1 = r1.a(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r3 = "system_tray_behavior"
            int r3 = r9.getColumnIndex(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            int r3 = r9.getInt(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            dgj r3 = defpackage.dgj.a(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            buw r1 = r1.a(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r3 = "last_updated__version"
            int r3 = r9.getColumnIndex(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            long r4 = r9.getLong(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            buw r1 = r1.a(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r3 = "last_notification_version"
            int r3 = r9.getColumnIndex(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            long r4 = r9.getLong(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            buw r3 = r1.b(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            dfz r1 = defpackage.dfz.a     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r4 = "notification_metadata"
            java.util.List r1 = b(r9, r1, r4)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            r3.a = r1     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            dfn r1 = defpackage.dfn.q     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r4 = "rendered_message"
            djo r1 = a(r9, r1, r4)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            dfn r1 = (defpackage.dfn) r1     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            buw r3 = r3.a(r1)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            dgu r1 = defpackage.dgu.b     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r4 = "payload"
            djo r1 = a(r9, r1, r4)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            dgu r1 = (defpackage.dgu) r1     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            r3.b = r1     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r1 = "update_thread_state_token"
            int r1 = r9.getColumnIndex(r1)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r1 = r9.getString(r1)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            r3.c = r1     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r1 = "group_id"
            int r1 = r9.getColumnIndex(r1)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r1 = r9.getString(r1)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            buw r1 = r3.b(r1)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.String r3 = "expiration_timestamp"
            int r3 = r9.getColumnIndex(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            long r4 = r9.getLong(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            buw r1 = r1.c(r3)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            buv r1 = r1.a()     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            r2.add(r1)     // Catch:{ RuntimeException -> 0x00e7, buo -> 0x0149, all -> 0x0138 }
            goto L_0x001c
        L_0x00e7:
            r1 = move-exception
            r10 = r1
            r1 = r9
            r9 = r0
            r0 = r10
        L_0x00ec:
            java.lang.String r2 = "ChimeThreadStorageImpl"
            java.lang.String r3 = "Error getting ChimeThreads for %s. Query: %s %s"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x013e }
            r5 = 0
            r4[r5] = r12     // Catch:{ all -> 0x013e }
            r5 = 1
            r4[r5] = r13     // Catch:{ all -> 0x013e }
            r5 = 2
            java.lang.String r6 = java.util.Arrays.toString(r14)     // Catch:{ all -> 0x013e }
            r4[r5] = r6     // Catch:{ all -> 0x013e }
            defpackage.bty.b(r2, r0, r3, r4)     // Catch:{ all -> 0x013e }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x013e }
            r0.<init>()     // Catch:{ all -> 0x013e }
            if (r1 == 0) goto L_0x010d
            r1.close()
        L_0x010d:
            if (r9 == 0) goto L_0x0112
            r9.close()
        L_0x0112:
            return r0
        L_0x0113:
            if (r9 == 0) goto L_0x0118
            r9.close()
        L_0x0118:
            if (r0 == 0) goto L_0x011d
            r0.close()
        L_0x011d:
            r0 = r2
            goto L_0x0112
        L_0x011f:
            r0 = move-exception
            r1 = r9
        L_0x0121:
            if (r1 == 0) goto L_0x0126
            r1.close()
        L_0x0126:
            if (r9 == 0) goto L_0x012b
            r9.close()
        L_0x012b:
            throw r0
        L_0x012c:
            r0 = move-exception
            r1 = r9
        L_0x012e:
            r10 = r1
            r1 = r9
            r9 = r10
            goto L_0x00ec
        L_0x0132:
            r1 = move-exception
            r10 = r1
            r1 = r9
            r9 = r0
            r0 = r10
            goto L_0x0121
        L_0x0138:
            r1 = move-exception
            r10 = r1
            r1 = r9
            r9 = r0
            r0 = r10
            goto L_0x0121
        L_0x013e:
            r0 = move-exception
            goto L_0x0121
        L_0x0140:
            r0 = move-exception
            r1 = r9
            goto L_0x00ec
        L_0x0143:
            r1 = move-exception
            r10 = r1
            r1 = r9
            r9 = r0
            r0 = r10
            goto L_0x00ec
        L_0x0149:
            r1 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x012e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bux.a(java.lang.String, java.lang.String, java.lang.String[]):java.util.List");
    }

    private final boolean b(java.lang.String str, java.lang.String str2, java.lang.String[] strArr) {
        boolean z = true;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = c(str).getWritableDatabase();
            if (sQLiteDatabase.delete("threads", str2, strArr) <= 0) {
                z = false;
            }
            if (sQLiteDatabase == null) {
                return z;
            }
            sQLiteDatabase.close();
            return z;
        } catch (defpackage.buo | java.lang.RuntimeException e) {
            defpackage.bty.b("ChimeThreadStorageImpl", e, "Error deleting ChimeThreads for %s. Query: %s %s", str, str2, java.util.Arrays.toString(strArr));
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            return false;
        } catch (Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    private static defpackage.djo a(android.database.Cursor cursor, defpackage.djo djo, java.lang.String str) {
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex(str));
            if (blob != null) {
                return djo.g().a(blob).d();
            }
        } catch (defpackage.dir e) {
            defpackage.bty.b("ChimeThreadStorageImpl", e, "Error parsing column %s for notification %s", str, cursor.getString(cursor.getColumnIndex("thread_id")));
        }
        return null;
    }

    private static java.util.List b(android.database.Cursor cursor, defpackage.djo djo, java.lang.String str) {
        defpackage.dih dih;
        try {
            byte[] blob = cursor.getBlob(cursor.getColumnIndex(str));
            if (blob != null) {
                defpackage.dii dii = (defpackage.dii) ((defpackage.dii) defpackage.cbr.b.a(defpackage.bg.ao)).a(blob, blob.length);
                if (dii.b) {
                    dih = dii.a;
                } else {
                    defpackage.dih dih2 = dii.a;
                    defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
                    dii.b = true;
                    dih = dii.a;
                }
                defpackage.dih dih3 = dih;
                if (!defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
                    throw new defpackage.dkw();
                }
                defpackage.cbr cbr = (defpackage.cbr) dih3;
                if (cbr != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(cbr.a.size());
                    for (defpackage.dgu dgu : cbr.a) {
                        arrayList.add(djo.g().a(dgu.a).d());
                    }
                    return arrayList;
                }
            }
        } catch (defpackage.dir e) {
            defpackage.bty.b("ChimeThreadStorageImpl", e, "Error parsing column %s for notification %s", str, cursor.getString(cursor.getColumnIndex("thread_id")));
        }
        return null;
    }

    private final synchronized defpackage.bvf c(java.lang.String str) {
        java.lang.Long valueOf;
        valueOf = java.lang.Long.valueOf(-1);
        if (str != null) {
            valueOf = this.b.a(str).a();
        }
        if (!this.c.containsKey(valueOf)) {
            this.c.put(valueOf, new defpackage.bvf(this.a, valueOf.longValue()));
        }
        return (defpackage.bvf) this.c.get(valueOf);
    }
}
