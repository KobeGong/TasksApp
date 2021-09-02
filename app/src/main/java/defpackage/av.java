package defpackage;

/* renamed from: av reason: default package */
/* compiled from: PG */
public final class av implements java.io.Serializable {
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("\\s*,\\s*");
    public static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("\\s*~\\s*");
    private static final defpackage.az d = new defpackage.aw();
    private static final defpackage.bi e = new defpackage.bi("other", d, null, null);
    private static final defpackage.av f = new defpackage.av(new defpackage.bj().a(e));
    private static final java.util.regex.Pattern g = java.util.regex.Pattern.compile("\\s*\\Q\\E@\\s*");
    private static final java.util.regex.Pattern h = java.util.regex.Pattern.compile("\\s*or\\s*");
    private static final java.util.regex.Pattern i = java.util.regex.Pattern.compile("\\s*and\\s*");
    private static final java.util.regex.Pattern j = java.util.regex.Pattern.compile("\\s*;\\s*");
    public static final long serialVersionUID = 1;
    public final defpackage.bj a;

    /* JADX WARNING: type inference failed for: r2v11, types: [byte, boolean] */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v11, types: [byte, boolean]
      assigns: [byte]
      uses: [boolean]
      mth insns count: 55
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
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.util.ArrayList.forEach(ArrayList.java:1257)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.av a(java.lang.String r8) {
        /*
            r1 = 0
            java.lang.String r0 = r8.trim()
            int r2 = r0.length()
            if (r2 != 0) goto L_0x000e
            av r0 = f
        L_0x000d:
            return r0
        L_0x000e:
            av r3 = new av
            bj r4 = new bj
            r4.<init>()
            java.lang.String r2 = ";"
            boolean r2 = r0.endsWith(r2)
            if (r2 == 0) goto L_0x0027
            int r2 = r0.length()
            int r2 = r2 + -1
            java.lang.String r0 = r0.substring(r1, r2)
        L_0x0027:
            java.util.regex.Pattern r2 = j
            java.lang.String[] r5 = r2.split(r0)
            r0 = r1
        L_0x002e:
            int r2 = r5.length
            if (r0 >= r2) goto L_0x0052
            r2 = r5[r0]
            java.lang.String r2 = r2.trim()
            bi r6 = c(r2)
            bd r2 = r6.c
            if (r2 != 0) goto L_0x0043
            bd r2 = r6.d
            if (r2 == 0) goto L_0x0050
        L_0x0043:
            r2 = 1
        L_0x0044:
            boolean r7 = r4.a
            r2 = r2 | r7
            byte r2 = (byte) r2
            r4.a = r2
            r4.a(r6)
            int r0 = r0 + 1
            goto L_0x002e
        L_0x0050:
            r2 = r1
            goto L_0x0044
        L_0x0052:
            r1 = 0
            java.util.List r0 = r4.b
            java.util.Iterator r2 = r0.iterator()
        L_0x0059:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r2.next()
            bi r0 = (defpackage.bi) r0
            java.lang.String r5 = "other"
            java.lang.String r6 = r0.a
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0086
            r2.remove()
        L_0x0072:
            r1 = r0
            goto L_0x0059
        L_0x0074:
            if (r1 != 0) goto L_0x007c
            java.lang.String r0 = "other:"
            bi r1 = c(r0)
        L_0x007c:
            java.util.List r0 = r4.b
            r0.add(r1)
            r3.<init>(r4)
            r0 = r3
            goto L_0x000d
        L_0x0086:
            r0 = r1
            goto L_0x0072
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av.a(java.lang.String):av");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0320, code lost:
        if (r15 != null) goto L_0x0329;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0322, code lost:
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0323, code lost:
        r14 = r14 + 1;
        r15 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0329, code lost:
        r2 = new defpackage.bf(r15, r13);
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0258  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:167:0x0346  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0234 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x017f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.az b(java.lang.String r30) {
        /*
            r3 = 0
            java.util.regex.Pattern r2 = h
            r0 = r30
            java.lang.String[] r25 = r2.split(r0)
            r2 = 0
            r14 = r2
            r15 = r3
        L_0x000c:
            r0 = r25
            int r2 = r0.length
            if (r14 >= r2) goto L_0x032f
            r13 = 0
            java.util.regex.Pattern r2 = i
            r3 = r25[r14]
            java.lang.String[] r26 = r2.split(r3)
            r2 = 0
            r16 = r2
        L_0x001d:
            r0 = r26
            int r2 = r0.length
            r0 = r16
            if (r0 >= r2) goto L_0x0320
            az r4 = d
            r2 = r26[r16]
            java.lang.String r27 = r2.trim()
            r3 = -1
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r2 = 0
        L_0x0033:
            int r5 = r27.length()
            if (r2 >= r5) goto L_0x00a8
            r0 = r27
            char r7 = r0.charAt(r2)
            r5 = 32
            if (r7 > r5) goto L_0x0069
            r5 = 32
            if (r7 == r5) goto L_0x0057
            r5 = 9
            if (r7 == r5) goto L_0x0057
            r5 = 10
            if (r7 == r5) goto L_0x0057
            r5 = 12
            if (r7 == r5) goto L_0x0057
            r5 = 13
            if (r7 != r5) goto L_0x0069
        L_0x0057:
            r5 = 1
        L_0x0058:
            if (r5 == 0) goto L_0x006b
            if (r3 < 0) goto L_0x0066
            r0 = r27
            java.lang.String r3 = r0.substring(r3, r2)
            r6.add(r3)
            r3 = -1
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x0033
        L_0x0069:
            r5 = 0
            goto L_0x0058
        L_0x006b:
            r5 = 61
            if (r7 > r5) goto L_0x00a2
            r5 = 33
            if (r7 < r5) goto L_0x00a2
            r5 = 33
            if (r7 == r5) goto L_0x0087
            r5 = 37
            if (r7 == r5) goto L_0x0087
            r5 = 44
            if (r7 == r5) goto L_0x0087
            r5 = 46
            if (r7 == r5) goto L_0x0087
            r5 = 61
            if (r7 != r5) goto L_0x00a2
        L_0x0087:
            r5 = 1
        L_0x0088:
            if (r5 == 0) goto L_0x00a4
            if (r3 < 0) goto L_0x0095
            r0 = r27
            java.lang.String r3 = r0.substring(r3, r2)
            r6.add(r3)
        L_0x0095:
            int r3 = r2 + 1
            r0 = r27
            java.lang.String r3 = r0.substring(r2, r3)
            r6.add(r3)
            r3 = -1
            goto L_0x0066
        L_0x00a2:
            r5 = 0
            goto L_0x0088
        L_0x00a4:
            if (r3 >= 0) goto L_0x0066
            r3 = r2
            goto L_0x0066
        L_0x00a8:
            if (r3 < 0) goto L_0x00b3
            r0 = r27
            java.lang.String r2 = r0.substring(r3)
            r6.add(r2)
        L_0x00b3:
            int r2 = r6.size()
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.Object[] r2 = r6.toArray(r2)
            java.lang.String[] r2 = (java.lang.String[]) r2
            r5 = 0
            r7 = 1
            r10 = 1
            r20 = 4890909195324358656(0x43e0000000000000, double:9.223372036854776E18)
            r18 = -4332462841530417152(0xc3e0000000000000, double:-9.223372036854776E18)
            r3 = 0
            r3 = r2[r3]
            r9 = 0
            be r6 = defpackage.be.a(r3)     // Catch:{ Exception -> 0x011a }
            r3 = 1
            int r8 = r2.length
            if (r3 >= r8) goto L_0x0357
            r3 = 1
            r4 = 2
            r3 = r2[r3]
            java.lang.String r8 = "mod"
            boolean r8 = r8.equals(r3)
            if (r8 != 0) goto L_0x00e6
            java.lang.String r8 = "%"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0350
        L_0x00e6:
            r3 = 2
            r3 = r2[r3]
            int r5 = java.lang.Integer.parseInt(r3)
            r3 = 3
            r4 = 4
            r0 = r27
            java.lang.String r3 = a(r2, r3, r0)
            r29 = r4
            r4 = r5
            r5 = r29
        L_0x00fa:
            java.lang.String r8 = "not"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0122
            r8 = 0
            int r7 = r5 + 1
            r0 = r27
            java.lang.String r3 = a(r2, r5, r0)
            java.lang.String r5 = "="
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L_0x0142
            r0 = r27
            java.text.ParseException r2 = a(r3, r0)
            throw r2
        L_0x011a:
            r2 = move-exception
            r0 = r27
            java.text.ParseException r2 = a(r3, r0)
            throw r2
        L_0x0122:
            java.lang.String r8 = "!"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x034d
            r8 = 0
            int r7 = r5 + 1
            r0 = r27
            java.lang.String r3 = a(r2, r5, r0)
            java.lang.String r5 = "="
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L_0x0142
            r0 = r27
            java.text.ParseException r2 = a(r3, r0)
            throw r2
        L_0x0142:
            r5 = r7
        L_0x0143:
            java.lang.String r7 = "is"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x015b
            java.lang.String r7 = "in"
            boolean r7 = r7.equals(r3)
            if (r7 != 0) goto L_0x015b
            java.lang.String r7 = "="
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x018a
        L_0x015b:
            java.lang.String r7 = "is"
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x016c
            if (r8 != 0) goto L_0x016c
            r0 = r27
            java.text.ParseException r2 = a(r3, r0)
            throw r2
        L_0x016c:
            int r9 = r5 + 1
            r0 = r27
            java.lang.String r3 = a(r2, r5, r0)
            r5 = r3
            r3 = r7
            r7 = r10
        L_0x0177:
            java.lang.String r10 = "not"
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L_0x0346
            if (r3 != 0) goto L_0x01a7
            if (r8 != 0) goto L_0x01a7
            r0 = r27
            java.text.ParseException r2 = a(r5, r0)
            throw r2
        L_0x018a:
            java.lang.String r7 = "within"
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x01a0
            r10 = 0
            int r7 = r5 + 1
            r0 = r27
            java.lang.String r3 = a(r2, r5, r0)
            r5 = r3
            r3 = r9
            r9 = r7
            r7 = r10
            goto L_0x0177
        L_0x01a0:
            r0 = r27
            java.text.ParseException r2 = a(r3, r0)
            throw r2
        L_0x01a7:
            if (r8 != 0) goto L_0x01ea
            r5 = 1
        L_0x01aa:
            int r10 = r9 + 1
            r0 = r27
            java.lang.String r8 = a(r2, r9, r0)
            r9 = r10
        L_0x01b3:
            java.util.ArrayList r28 = new java.util.ArrayList
            r28.<init>()
            r10 = r18
            r18 = r20
        L_0x01bc:
            long r22 = java.lang.Long.parseLong(r8)
            int r12 = r2.length
            if (r9 >= r12) goto L_0x033f
            int r12 = r9 + 1
            r0 = r27
            java.lang.String r8 = a(r2, r9, r0)
            java.lang.String r9 = "."
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x021c
            int r8 = r12 + 1
            r0 = r27
            java.lang.String r9 = a(r2, r12, r0)
            java.lang.String r12 = "."
            boolean r12 = r9.equals(r12)
            if (r12 != 0) goto L_0x01ec
            r0 = r27
            java.text.ParseException r2 = a(r9, r0)
            throw r2
        L_0x01ea:
            r5 = 0
            goto L_0x01aa
        L_0x01ec:
            int r20 = r8 + 1
            r0 = r27
            java.lang.String r12 = a(r2, r8, r0)
            long r8 = java.lang.Long.parseLong(r12)
            int r0 = r2.length
            r17 = r0
            r0 = r20
            r1 = r17
            if (r0 >= r1) goto L_0x0339
            int r17 = r20 + 1
            r0 = r20
            r1 = r27
            java.lang.String r12 = a(r2, r0, r1)
            java.lang.String r20 = ","
            r0 = r20
            boolean r20 = r12.equals(r0)
            if (r20 != 0) goto L_0x0333
            r0 = r27
            java.text.ParseException r2 = a(r12, r0)
            throw r2
        L_0x021c:
            java.lang.String r9 = ","
            boolean r9 = r8.equals(r9)
            if (r9 != 0) goto L_0x022b
            r0 = r27
            java.text.ParseException r2 = a(r8, r0)
            throw r2
        L_0x022b:
            r20 = r22
            r24 = r12
            r12 = r8
        L_0x0230:
            int r8 = (r22 > r20 ? 1 : (r22 == r20 ? 0 : -1))
            if (r8 <= 0) goto L_0x0258
            r2 = 41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r0 = r22
            java.lang.StringBuilder r2 = r3.append(r0)
            java.lang.String r3 = "~"
            java.lang.StringBuilder r2 = r2.append(r3)
            r0 = r20
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            r0 = r27
            java.text.ParseException r2 = a(r2, r0)
            throw r2
        L_0x0258:
            if (r4 == 0) goto L_0x0281
            long r8 = (long) r4
            int r8 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
            if (r8 < 0) goto L_0x0281
            r2 = 36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r2)
            r0 = r20
            java.lang.StringBuilder r2 = r3.append(r0)
            java.lang.String r3 = ">mod="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0 = r27
            java.text.ParseException r2 = a(r2, r0)
            throw r2
        L_0x0281:
            java.lang.Long r8 = java.lang.Long.valueOf(r22)
            r0 = r28
            r0.add(r8)
            java.lang.Long r8 = java.lang.Long.valueOf(r20)
            r0 = r28
            r0.add(r8)
            r0 = r22
            double r8 = (double) r0
            r0 = r18
            double r8 = java.lang.Math.min(r0, r8)
            r0 = r20
            double r0 = (double) r0
            r18 = r0
            r0 = r18
            double r10 = java.lang.Math.max(r10, r0)
            int r0 = r2.length
            r17 = r0
            r0 = r24
            r1 = r17
            if (r0 >= r1) goto L_0x02c1
            int r17 = r24 + 1
            r0 = r24
            r1 = r27
            java.lang.String r12 = a(r2, r0, r1)
            r18 = r8
            r9 = r17
            r8 = r12
            goto L_0x01bc
        L_0x02c1:
            java.lang.String r2 = ","
            boolean r2 = r12.equals(r2)
            if (r2 == 0) goto L_0x02d0
            r0 = r27
            java.text.ParseException r2 = a(r12, r0)
            throw r2
        L_0x02d0:
            int r2 = r28.size()
            r12 = 2
            if (r2 != r12) goto L_0x02e9
            r12 = 0
        L_0x02d8:
            int r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r2 == 0) goto L_0x030a
            if (r3 == 0) goto L_0x030a
            if (r5 != 0) goto L_0x030a
            java.lang.String r2 = "is not <range>"
            r0 = r27
            java.text.ParseException r2 = a(r2, r0)
            throw r2
        L_0x02e9:
            int r2 = r28.size()
            long[] r0 = new long[r2]
            r17 = r0
            r2 = 0
            r12 = r2
        L_0x02f3:
            r0 = r17
            int r2 = r0.length
            if (r12 >= r2) goto L_0x0330
            r0 = r28
            java.lang.Object r2 = r0.get(r12)
            java.lang.Long r2 = (java.lang.Long) r2
            long r18 = r2.longValue()
            r17[r12] = r18
            int r2 = r12 + 1
            r12 = r2
            goto L_0x02f3
        L_0x030a:
            bh r3 = new bh
            r3.<init>(r4, r5, r6, r7, r8, r10, r12)
            r2 = r3
        L_0x0310:
            if (r13 != 0) goto L_0x0319
            r13 = r2
        L_0x0313:
            int r2 = r16 + 1
            r16 = r2
            goto L_0x001d
        L_0x0319:
            ax r3 = new ax
            r3.<init>(r13, r2)
            r13 = r3
            goto L_0x0313
        L_0x0320:
            if (r15 != 0) goto L_0x0329
            r2 = r13
        L_0x0323:
            int r3 = r14 + 1
            r14 = r3
            r15 = r2
            goto L_0x000c
        L_0x0329:
            bf r2 = new bf
            r2.<init>(r15, r13)
            goto L_0x0323
        L_0x032f:
            return r15
        L_0x0330:
            r12 = r17
            goto L_0x02d8
        L_0x0333:
            r20 = r8
            r24 = r17
            goto L_0x0230
        L_0x0339:
            r24 = r20
            r20 = r8
            goto L_0x0230
        L_0x033f:
            r20 = r22
            r12 = r8
            r24 = r9
            goto L_0x0230
        L_0x0346:
            r29 = r5
            r5 = r8
            r8 = r29
            goto L_0x01b3
        L_0x034d:
            r8 = r7
            goto L_0x0143
        L_0x0350:
            r29 = r4
            r4 = r5
            r5 = r29
            goto L_0x00fa
        L_0x0357:
            r2 = r4
            goto L_0x0310
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.av.b(java.lang.String):az");
    }

    private static java.text.ParseException a(java.lang.String str, java.lang.String str2) {
        return new java.text.ParseException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 25 + java.lang.String.valueOf(str2).length()).append("unexpected token '").append(str).append("' in '").append(str2).append("'").toString(), -1);
    }

    private static java.lang.String a(java.lang.String[] strArr, int i2, java.lang.String str) {
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        throw new java.text.ParseException(new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 26).append("missing token at end of '").append(str).append("'").toString(), -1);
    }

    private static defpackage.bi c(java.lang.String str) {
        boolean z;
        defpackage.bd a2;
        defpackage.az b2;
        defpackage.bd bdVar = null;
        boolean z2 = true;
        if (str.length() == 0) {
            return e;
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ENGLISH);
        int indexOf = lowerCase.indexOf(58);
        if (indexOf == -1) {
            throw new java.text.ParseException(new java.lang.StringBuilder(java.lang.String.valueOf(lowerCase).length() + 34).append("missing ':' in rule description '").append(lowerCase).append("'").toString(), 0);
        }
        java.lang.String trim = lowerCase.substring(0, indexOf).trim();
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
            throw new java.text.ParseException(new java.lang.StringBuilder(java.lang.String.valueOf(trim).length() + 22).append("keyword '").append(trim).append(" is not valid").toString(), 0);
        }
        java.lang.String trim2 = lowerCase.substring(indexOf + 1).trim();
        java.lang.String[] split = g.split(trim2);
        switch (split.length) {
            case 1:
                a2 = null;
                break;
            case 2:
                a2 = defpackage.bd.a(split[1]);
                if (a2.a != defpackage.bg.d) {
                    bdVar = a2;
                    a2 = null;
                    break;
                }
                break;
            case 3:
                bdVar = defpackage.bd.a(split[1]);
                a2 = defpackage.bd.a(split[2]);
                if (!(bdVar.a == defpackage.bg.c && a2.a == defpackage.bg.d)) {
                    java.lang.String str2 = "Must have @integer then @decimal in ";
                    java.lang.String valueOf = java.lang.String.valueOf(trim2);
                    throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new java.lang.String(str2));
                }
            default:
                java.lang.String str3 = "Too many samples in ";
                java.lang.String valueOf2 = java.lang.String.valueOf(trim2);
                throw new java.lang.IllegalArgumentException(valueOf2.length() != 0 ? str3.concat(valueOf2) : new java.lang.String(str3));
        }
        boolean equals = trim.equals("other");
        if (split[0].length() != 0) {
            z2 = false;
        }
        if (equals != z2) {
            throw new java.lang.IllegalArgumentException("The keyword 'other' must have no constraints, just samples.");
        }
        if (equals) {
            b2 = d;
        } else {
            b2 = b(split[0]);
        }
        return new defpackage.bi(trim, b2, bdVar, a2);
    }

    /* access modifiers changed from: private */
    public static void b(java.lang.StringBuilder sb, double d2, double d3, boolean z) {
        if (z) {
            sb.append(",");
        }
        if (d2 == d3) {
            sb.append(a(d2));
            return;
        }
        java.lang.String a2 = a(d2);
        java.lang.String a3 = a(d3);
        sb.append(new java.lang.StringBuilder(java.lang.String.valueOf(a2).length() + 2 + java.lang.String.valueOf(a3).length()).append(a2).append("..").append(a3).toString());
    }

    private static java.lang.String a(double d2) {
        long j2 = (long) d2;
        return d2 == ((double) j2) ? java.lang.String.valueOf(j2) : java.lang.String.valueOf(d2);
    }

    public static defpackage.av a(java.util.Locale locale, int i2) {
        java.util.Map emptyMap;
        java.util.Map emptyMap2;
        boolean z = true;
        defpackage.bk bkVar = defpackage.bk.f;
        synchronized (bkVar) {
            if (bkVar.d == null) {
                z = false;
            }
        }
        if (!z) {
            try {
                java.util.ResourceBundle resourceBundle = defpackage.bk.c;
                java.lang.Object[][] objArr = (java.lang.Object[][]) resourceBundle.getObject("locales");
                java.util.Map treeMap = new java.util.TreeMap();
                for (java.lang.Object[] objArr2 : objArr) {
                    treeMap.put((java.lang.String) objArr2[0], (java.lang.String) objArr2[1]);
                }
                java.lang.Object[][] objArr3 = (java.lang.Object[][]) resourceBundle.getObject("locales_ordinals");
                java.util.Map treeMap2 = new java.util.TreeMap();
                for (java.lang.Object[] objArr4 : objArr3) {
                    treeMap2.put((java.lang.String) objArr4[0], (java.lang.String) objArr4[1]);
                }
                emptyMap2 = treeMap2;
                emptyMap = treeMap;
            } catch (java.util.MissingResourceException e2) {
                emptyMap = java.util.Collections.emptyMap();
                emptyMap2 = java.util.Collections.emptyMap();
            }
            synchronized (bkVar) {
                if (bkVar.d == null) {
                    bkVar.d = emptyMap;
                    bkVar.e = emptyMap2;
                }
            }
        }
        java.lang.String str = (java.lang.String) (i2 == defpackage.bg.a ? bkVar.d : bkVar.e).get(locale.getLanguage());
        if (str == null || str.trim().length() == 0) {
            return f;
        }
        defpackage.av a2 = bkVar.a(str);
        if (a2 == null) {
            return f;
        }
        return a2;
    }

    private av(defpackage.bj bjVar) {
        this.a = bjVar;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (defpackage.bi biVar : bjVar.b) {
            linkedHashSet.add(biVar.a);
        }
        java.util.Collections.unmodifiableSet(linkedHashSet);
    }

    @java.lang.Deprecated
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        boolean z;
        if (obj instanceof defpackage.av) {
            defpackage.av avVar = (defpackage.av) obj;
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
        java.util.regex.Pattern.compile("\\s*\\Q..\\E\\s*");
    }
}
