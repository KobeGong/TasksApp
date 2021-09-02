package defpackage;

/* renamed from: bup reason: default package */
/* compiled from: PG */
public final class bup {
    private final defpackage.buy a;

    /* JADX WARNING: type inference failed for: r9v0, types: [android.database.Cursor] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004a A[SYNTHETIC, Splitter:B:25:0x004a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005a A[SYNTHETIC, Splitter:B:35:0x005a] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005f  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List a() {
        /*
            r12 = this;
            r9 = 0
            monitor-enter(r12)
            defpackage.cky.c()     // Catch:{ all -> 0x0053 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0053 }
            r10.<init>()     // Catch:{ all -> 0x0053 }
            buy r0 = r12.a     // Catch:{ RuntimeException -> 0x003c, all -> 0x0056 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch:{ RuntimeException -> 0x003c, all -> 0x0056 }
            java.lang.String r1 = "accounts"
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x006a, all -> 0x0063 }
            boolean r1 = r9.moveToFirst()     // Catch:{ RuntimeException -> 0x006a, all -> 0x0063 }
            if (r1 == 0) goto L_0x0030
        L_0x0023:
            bul r1 = a(r9)     // Catch:{ RuntimeException -> 0x006a, all -> 0x0063 }
            r10.add(r1)     // Catch:{ RuntimeException -> 0x006a, all -> 0x0063 }
            boolean r1 = r9.moveToNext()     // Catch:{ RuntimeException -> 0x006a, all -> 0x0063 }
            if (r1 != 0) goto L_0x0023
        L_0x0030:
            if (r9 == 0) goto L_0x0035
            r9.close()     // Catch:{ all -> 0x0053 }
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            r0.close()     // Catch:{ all -> 0x0053 }
        L_0x003a:
            monitor-exit(r12)
            return r10
        L_0x003c:
            r0 = move-exception
            r1 = r9
        L_0x003e:
            java.lang.String r2 = "ChimeAccountStorageImpl"
            java.lang.String r3 = "Error getting list of available ChimeAccounts."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0068 }
            defpackage.bty.b(r2, r0, r3, r4)     // Catch:{ all -> 0x0068 }
            if (r9 == 0) goto L_0x004d
            r9.close()     // Catch:{ all -> 0x0053 }
        L_0x004d:
            if (r1 == 0) goto L_0x003a
            r1.close()     // Catch:{ all -> 0x0053 }
            goto L_0x003a
        L_0x0053:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x0056:
            r0 = move-exception
            r1 = r9
        L_0x0058:
            if (r9 == 0) goto L_0x005d
            r9.close()     // Catch:{ all -> 0x0053 }
        L_0x005d:
            if (r1 == 0) goto L_0x0062
            r1.close()     // Catch:{ all -> 0x0053 }
        L_0x0062:
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0063:
            r1 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
            goto L_0x0058
        L_0x0068:
            r0 = move-exception
            goto L_0x0058
        L_0x006a:
            r1 = move-exception
            r11 = r1
            r1 = r0
            r0 = r11
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bup.a():java.util.List");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r0v7, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v2
      assigns: []
      uses: []
      mth insns count: 57
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006d A[SYNTHETIC, Splitter:B:35:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0072  */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.bul a(java.lang.String r12) {
        /*
            r11 = this;
            r9 = 0
            monitor-enter(r11)
            defpackage.cky.c()     // Catch:{ all -> 0x0053 }
            buy r0 = r11.a     // Catch:{ RuntimeException -> 0x0056, all -> 0x0076 }
            android.database.sqlite.SQLiteDatabase r0 = r0.getReadableDatabase()     // Catch:{ RuntimeException -> 0x0056, all -> 0x0076 }
            java.lang.String r1 = "accounts"
            r2 = 0
            java.lang.String r3 = "account_name=?"
            r4 = 1
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
            r5 = 0
            r4[r5] = r12     // Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
            int r1 = r9.getCount()     // Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
            if (r1 <= 0) goto L_0x0037
            r9.moveToFirst()     // Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
            bul r1 = a(r9)     // Catch:{ RuntimeException -> 0x007e, all -> 0x0079 }
            if (r9 == 0) goto L_0x0030
            r9.close()     // Catch:{ all -> 0x0053 }
        L_0x0030:
            if (r0 == 0) goto L_0x0035
            r0.close()     // Catch:{ all -> 0x0053 }
        L_0x0035:
            monitor-exit(r11)
            return r1
        L_0x0037:
            if (r9 == 0) goto L_0x003c
            r9.close()     // Catch:{ all -> 0x0053 }
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.close()     // Catch:{ all -> 0x0053 }
        L_0x0041:
            buo r0 = new buo     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = "ChimeAccount not found [%s]"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0053 }
            r3 = 0
            r2[r3] = r12     // Catch:{ all -> 0x0053 }
            java.lang.String r1 = java.lang.String.format(r1, r2)     // Catch:{ all -> 0x0053 }
            r0.<init>(r1)     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        L_0x0056:
            r0 = move-exception
            r1 = r9
        L_0x0058:
            buo r2 = new buo     // Catch:{ all -> 0x006a }
            java.lang.String r3 = "Error getting ChimeAccount [%s]"
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x006a }
            r5 = 0
            r4[r5] = r12     // Catch:{ all -> 0x006a }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x006a }
            r2.<init>(r3, r0)     // Catch:{ all -> 0x006a }
            throw r2     // Catch:{ all -> 0x006a }
        L_0x006a:
            r0 = move-exception
        L_0x006b:
            if (r9 == 0) goto L_0x0070
            r9.close()     // Catch:{ all -> 0x0053 }
        L_0x0070:
            if (r1 == 0) goto L_0x0075
            r1.close()     // Catch:{ all -> 0x0053 }
        L_0x0075:
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0076:
            r0 = move-exception
            r1 = r9
            goto L_0x006b
        L_0x0079:
            r1 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x006b
        L_0x007e:
            r1 = move-exception
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bup.a(java.lang.String):bul");
    }

    public final synchronized boolean b(java.lang.String str) {
        boolean z = true;
        synchronized (this) {
            defpackage.cky.c();
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabase = this.a.getWritableDatabase();
                if (sQLiteDatabase.delete("accounts", "account_name=?", new java.lang.String[]{str}) <= 0) {
                    z = false;
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            } catch (java.lang.RuntimeException e) {
                defpackage.bty.b("ChimeAccountStorageImpl", e, "Error deleting ChimeAccount [%s]", str);
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                z = false;
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        return z;
    }

    public final synchronized long a(defpackage.bul bul) {
        long insertWithOnConflict;
        int i = null;
        synchronized (this) {
            defpackage.cky.c();
            defpackage.cld.a((java.lang.Object) bul, (java.lang.Object) "Account must not be empty.");
            try {
                android.content.ContentValues c = c(bul);
                i = this.a.getWritableDatabase();
                insertWithOnConflict = i.insertWithOnConflict("accounts", null, c, 2);
                if (insertWithOnConflict <= 0) {
                    java.lang.String str = "Conflict inserting ChimeAccount: ";
                    java.lang.String valueOf = java.lang.String.valueOf(bul.b());
                    throw new defpackage.bun(valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str));
                } else if (i != null) {
                    i.close();
                }
            } catch (java.lang.RuntimeException e) {
                java.lang.String str2 = "Error inserting ChimeAccount: ";
                java.lang.String valueOf2 = java.lang.String.valueOf(bul.b());
                i = valueOf2.length();
                throw new defpackage.bun(i != 0 ? str2.concat(valueOf2) : new java.lang.String(str2), e);
            } finally {
                if (i != null) {
                    i.close();
                }
            }
        }
        return insertWithOnConflict;
    }

    public final synchronized boolean b(defpackage.bul bul) {
        boolean z = true;
        synchronized (this) {
            defpackage.cky.c();
            defpackage.cld.a((java.lang.Object) bul, (java.lang.Object) "Account must not be empty.");
            android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
            try {
                android.content.ContentValues c = c(bul);
                sQLiteDatabase = this.a.getWritableDatabase();
                if (sQLiteDatabase.update("accounts", c, "account_name=?", new java.lang.String[]{bul.b()}) <= 0) {
                    z = false;
                }
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
            } catch (java.lang.RuntimeException e) {
                defpackage.bty.b("ChimeAccountStorageImpl", e, "Error updating ChimeAccount [%s]", bul.b());
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                z = false;
            } catch (Throwable th) {
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        }
        return z;
    }

    public bup(android.content.Context context) {
        this.a = new defpackage.buy(context);
    }

    private static defpackage.bul a(android.database.Cursor cursor) {
        defpackage.bum j = defpackage.bul.j();
        j.a = java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndex("_id")));
        defpackage.bum a2 = j.a(cursor.getString(cursor.getColumnIndex("account_name")));
        a2.b = cursor.getString(cursor.getColumnIndex("obfuscated_gaia_id"));
        return a2.a(java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndex("sync_version")))).b(java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndex("page_version")))).a(defpackage.btk.a(cursor.getInt(cursor.getColumnIndex("registration_status")))).c(java.lang.Long.valueOf(cursor.getLong(cursor.getColumnIndex("last_registration_time_ms")))).a(cursor.getInt(cursor.getColumnIndex("last_registration_request_hash"))).a();
    }

    private static android.content.ContentValues c(defpackage.bul bul) {
        android.content.ContentValues contentValues = new android.content.ContentValues(7);
        contentValues.put("account_name", bul.b());
        contentValues.put("obfuscated_gaia_id", bul.c());
        contentValues.put("sync_version", bul.d());
        contentValues.put("page_version", bul.e());
        contentValues.put("registration_status", java.lang.Integer.valueOf(bul.f().g));
        contentValues.put("last_registration_time_ms", bul.g());
        contentValues.put("last_registration_request_hash", java.lang.Integer.valueOf(bul.h()));
        return contentValues;
    }
}
