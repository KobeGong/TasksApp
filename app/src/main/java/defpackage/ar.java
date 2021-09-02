package defpackage;

/* renamed from: ar reason: default package */
/* compiled from: PG */
public final class ar extends java.text.Format {
    private static final java.lang.String[] h = {"number", "date", "time", "spellout", "ordinal", "duration"};
    private static final java.lang.String[] i = {"", "currency", "percent", "integer"};
    private static final java.lang.String[] j = {"", "short", "medium", "long", "full"};
    private static final java.util.Locale k = new java.util.Locale("");
    public static final long serialVersionUID = 7136212545847378652L;
    public transient java.util.Locale a;
    public transient defpackage.bl b;
    public transient java.util.Map c;
    private transient java.text.DateFormat d;
    private transient java.text.NumberFormat e;
    private transient defpackage.au f;
    private transient defpackage.au g;

    public static final java.lang.String a(java.util.Locale locale, java.lang.String str, java.lang.Object... objArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        new defpackage.ar(str, locale).a(0, null, null, null, objArr, new defpackage.jd(sb), null);
        return sb.toString();
    }

    private ar(java.lang.String str, java.util.Locale locale) {
        int i2;
        java.lang.String str2;
        java.lang.Object timeInstance;
        this.a = locale;
        try {
            if (this.b == null) {
                this.b = new defpackage.bl(str);
            } else {
                this.b.a(str);
            }
            if (this.c != null) {
                this.c.clear();
            }
            int size = this.b.c.size() - 2;
            for (int i3 = 1; i3 < size; i3 = i2 + 1) {
                defpackage.bo a2 = this.b.a(i3);
                if (a2.a == defpackage.bp.ARG_START && a2.b() == defpackage.bn.SIMPLE) {
                    int i4 = i3 + 2;
                    int i5 = i4 + 1;
                    java.lang.String a3 = this.b.a(this.b.a(i4));
                    java.lang.String str3 = "";
                    defpackage.bo a4 = this.b.a(i5);
                    if (a4.a == defpackage.bp.ARG_STYLE) {
                        str2 = this.b.a(a4);
                        i2 = i5 + 1;
                    } else {
                        str2 = str3;
                        i2 = i5;
                    }
                    switch (a(a3, h)) {
                        case 0:
                            switch (a(str2, i)) {
                                case 0:
                                    timeInstance = java.text.NumberFormat.getInstance(this.a);
                                    break;
                                case 1:
                                    timeInstance = java.text.NumberFormat.getCurrencyInstance(this.a);
                                    break;
                                case 2:
                                    timeInstance = java.text.NumberFormat.getPercentInstance(this.a);
                                    break;
                                case 3:
                                    timeInstance = java.text.NumberFormat.getIntegerInstance(this.a);
                                    break;
                                default:
                                    timeInstance = new java.text.DecimalFormat(str2, new java.text.DecimalFormatSymbols(this.a));
                                    break;
                            }
                        case 1:
                            switch (a(str2, j)) {
                                case 0:
                                    timeInstance = java.text.DateFormat.getDateInstance(2, this.a);
                                    break;
                                case 1:
                                    timeInstance = java.text.DateFormat.getDateInstance(3, this.a);
                                    break;
                                case 2:
                                    timeInstance = java.text.DateFormat.getDateInstance(2, this.a);
                                    break;
                                case 3:
                                    timeInstance = java.text.DateFormat.getDateInstance(1, this.a);
                                    break;
                                case 4:
                                    timeInstance = java.text.DateFormat.getDateInstance(0, this.a);
                                    break;
                                default:
                                    timeInstance = new java.text.SimpleDateFormat(str2, this.a);
                                    break;
                            }
                        case 2:
                            switch (a(str2, j)) {
                                case 0:
                                    timeInstance = java.text.DateFormat.getTimeInstance(2, this.a);
                                    break;
                                case 1:
                                    timeInstance = java.text.DateFormat.getTimeInstance(3, this.a);
                                    break;
                                case 2:
                                    timeInstance = java.text.DateFormat.getTimeInstance(2, this.a);
                                    break;
                                case 3:
                                    timeInstance = java.text.DateFormat.getTimeInstance(1, this.a);
                                    break;
                                case 4:
                                    timeInstance = java.text.DateFormat.getTimeInstance(0, this.a);
                                    break;
                                default:
                                    timeInstance = new java.text.SimpleDateFormat(str2, this.a);
                                    break;
                            }
                        default:
                            throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(a3).length() + 22).append("Unknown format type \"").append(a3).append("\"").toString());
                    }
                    if (this.c == null) {
                        this.c = new java.util.HashMap();
                    }
                    this.c.put(java.lang.Integer.valueOf(i3), timeInstance);
                } else {
                    i2 = i3;
                }
            }
        } catch (java.lang.RuntimeException e2) {
            if (this.b != null) {
                defpackage.bl blVar = this.b;
                blVar.b = null;
                blVar.e = false;
                blVar.c.clear();
                if (blVar.d != null) {
                    blVar.d.clear();
                }
            }
            if (this.c != null) {
                this.c.clear();
            }
            throw e2;
        }
    }

    public final java.lang.StringBuffer format(java.lang.Object obj, java.lang.StringBuffer stringBuffer, java.text.FieldPosition fieldPosition) {
        a(obj, new defpackage.jd(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    public final java.text.AttributedCharacterIterator formatToCharacterIterator(java.lang.Object obj) {
        if (obj == null) {
            throw new java.lang.NullPointerException("formatToCharacterIterator must be passed non-null object");
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        defpackage.jd jdVar = new defpackage.jd(sb);
        jdVar.c = new java.util.ArrayList();
        a(obj, jdVar, (java.text.FieldPosition) null);
        java.text.AttributedString attributedString = new java.text.AttributedString(sb.toString());
        for (defpackage.lf lfVar : jdVar.c) {
            attributedString.addAttribute(lfVar.d, lfVar.e, lfVar.f, lfVar.g);
        }
        return attributedString.getIterator();
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.String r27, java.text.ParsePosition r28, java.lang.Object[] r29, java.util.Map r30) {
        /*
            r26 = this;
            if (r27 != 0) goto L_0x0003
        L_0x0002:
            return
        L_0x0003:
            r0 = r26
            bl r4 = r0.b
            java.lang.String r0 = r4.b
            r17 = r0
            r0 = r26
            bl r4 = r0.b
            r5 = 0
            bo r4 = r4.a(r5)
            int r6 = r4.a()
            int r5 = r28.getIndex()
            java.text.ParsePosition r18 = new java.text.ParsePosition
            r4 = 0
            r0 = r18
            r0.<init>(r4)
            r4 = 1
        L_0x0025:
            r0 = r26
            bl r7 = r0.b
            bo r7 = r7.a(r4)
            bp r8 = r7.a
            int r9 = r7.b
            int r9 = r9 - r6
            if (r9 == 0) goto L_0x003e
            r0 = r17
            r1 = r27
            boolean r6 = r0.regionMatches(r6, r1, r5, r9)
            if (r6 == 0) goto L_0x004c
        L_0x003e:
            int r16 = r5 + r9
            bp r5 = defpackage.bp.MSG_LIMIT
            if (r8 != r5) goto L_0x0052
            r0 = r28
            r1 = r16
            r0.setIndex(r1)
            goto L_0x0002
        L_0x004c:
            r0 = r28
            r0.setErrorIndex(r5)
            goto L_0x0002
        L_0x0052:
            bp r5 = defpackage.bp.SKIP_SYNTAX
            if (r8 == r5) goto L_0x005a
            bp r5 = defpackage.bp.INSERT_CHAR
            if (r8 != r5) goto L_0x0063
        L_0x005a:
            int r6 = r7.a()
            r5 = r16
        L_0x0060:
            int r4 = r4 + 1
            goto L_0x0025
        L_0x0063:
            r0 = r26
            bl r5 = r0.b
            int r13 = r5.c(r4)
            bn r8 = r7.b()
            r0 = r26
            bl r5 = r0.b
            int r9 = r4 + 1
            bo r6 = r5.a(r9)
            r5 = 0
            r4 = 0
            if (r29 == 0) goto L_0x00c2
            short r5 = r6.d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r7 = r6
            r6 = r5
            r5 = r4
        L_0x0086:
            int r11 = r9 + 1
            r10 = 0
            r9 = 0
            r0 = r26
            java.util.Map r4 = r0.c
            if (r4 == 0) goto L_0x00fc
            r0 = r26
            java.util.Map r4 = r0.c
            int r12 = r11 + -2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object r4 = r4.get(r12)
            java.text.Format r4 = (java.text.Format) r4
            if (r4 == 0) goto L_0x00fc
            r0 = r18
            r1 = r16
            r0.setIndex(r1)
            r0 = r27
            r1 = r18
            java.lang.Object r4 = r4.parseObject(r0, r1)
            int r7 = r18.getIndex()
            r0 = r16
            if (r7 != r0) goto L_0x00db
            r0 = r28
            r1 = r16
            r0.setErrorIndex(r1)
            goto L_0x0002
        L_0x00c2:
            bp r4 = r6.a
            bp r7 = defpackage.bp.ARG_NAME
            if (r4 != r7) goto L_0x00d4
            r0 = r26
            bl r4 = r0.b
            java.lang.String r4 = r4.a(r6)
        L_0x00d0:
            r6 = r5
            r7 = r4
            r5 = r4
            goto L_0x0086
        L_0x00d4:
            short r4 = r6.d
            java.lang.String r4 = java.lang.Integer.toString(r4)
            goto L_0x00d0
        L_0x00db:
            r7 = 1
            int r8 = r18.getIndex()
            r25 = r4
            r4 = r8
            r8 = r7
            r7 = r25
        L_0x00e6:
            if (r8 == 0) goto L_0x00ec
            if (r29 == 0) goto L_0x02b0
            r29[r6] = r7
        L_0x00ec:
            r0 = r26
            bl r5 = r0.b
            bo r5 = r5.a(r13)
            int r6 = r5.a()
            r5 = r4
            r4 = r13
            goto L_0x0060
        L_0x00fc:
            bn r4 = defpackage.bn.NONE
            if (r8 == r4) goto L_0x0116
            r0 = r26
            java.util.Map r4 = r0.c
            if (r4 == 0) goto L_0x01b1
            r0 = r26
            java.util.Map r4 = r0.c
            int r12 = r11 + -2
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            boolean r4 = r4.containsKey(r12)
            if (r4 == 0) goto L_0x01b1
        L_0x0116:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r0 = r26
            bl r4 = r0.b
            java.lang.String r12 = r4.b
            r0 = r26
            bl r4 = r0.b
            bo r4 = r4.a(r13)
            int r8 = r4.a()
            int r4 = r13 + 1
        L_0x012f:
            r0 = r26
            bl r14 = r0.b
            bo r14 = r14.a(r4)
            bp r15 = r14.a
            int r0 = r14.b
            r19 = r0
            r0 = r19
            r11.append(r12, r8, r0)
            bp r8 = defpackage.bp.ARG_START
            if (r15 == r8) goto L_0x014a
            bp r8 = defpackage.bp.MSG_LIMIT
            if (r15 != r8) goto L_0x0167
        L_0x014a:
            java.lang.String r4 = r11.toString()
            int r8 = r4.length()
            if (r8 == 0) goto L_0x016e
            r0 = r27
            r1 = r16
            int r8 = r0.indexOf(r4, r1)
        L_0x015c:
            if (r8 >= 0) goto L_0x0173
            r0 = r28
            r1 = r16
            r0.setErrorIndex(r1)
            goto L_0x0002
        L_0x0167:
            int r8 = r14.a()
            int r4 = r4 + 1
            goto L_0x012f
        L_0x016e:
            int r8 = r27.length()
            goto L_0x015c
        L_0x0173:
            r0 = r27
            r1 = r16
            java.lang.String r4 = r0.substring(r1, r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r11 = java.lang.String.valueOf(r7)
            int r11 = r11.length()
            int r11 = r11 + 2
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "{"
            java.lang.StringBuilder r11 = r12.append(r11)
            java.lang.StringBuilder r7 = r11.append(r7)
            java.lang.String r11 = "}"
            java.lang.StringBuilder r7 = r7.append(r11)
            java.lang.String r7 = r7.toString()
            boolean r7 = r4.equals(r7)
            if (r7 != 0) goto L_0x02b9
            r7 = 1
        L_0x01a9:
            r25 = r4
            r4 = r8
            r8 = r7
            r7 = r25
            goto L_0x00e6
        L_0x01b1:
            bn r4 = defpackage.bn.CHOICE
            if (r8 != r4) goto L_0x0277
            r0 = r18
            r1 = r16
            r0.setIndex(r1)
            r0 = r26
            bl r0 = r0.b
            r19 = r0
            int r7 = r18.getIndex()
            r8 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            r4 = r7
            r10 = r11
        L_0x01ca:
            r0 = r19
            bp r11 = r0.b(r10)
            bp r12 = defpackage.bp.ARG_LIMIT
            if (r11 == r12) goto L_0x0246
            r0 = r19
            bo r11 = r0.a(r10)
            r0 = r19
            double r14 = r0.b(r11)
            int r12 = r10 + 2
            r0 = r19
            int r20 = r0.c(r12)
            r11 = 0
            r0 = r19
            java.lang.String r0 = r0.b
            r21 = r0
            r0 = r19
            bo r10 = r0.a(r12)
            int r10 = r10.a()
        L_0x01f9:
            int r12 = r12 + 1
            r0 = r19
            bo r22 = r0.a(r12)
            r0 = r20
            if (r12 == r0) goto L_0x0213
            r0 = r22
            bp r0 = r0.a
            r23 = r0
            bp r24 = defpackage.bp.SKIP_SYNTAX
            r0 = r23
            r1 = r24
            if (r0 != r1) goto L_0x01f9
        L_0x0213:
            r0 = r22
            int r0 = r0.b
            r23 = r0
            int r23 = r23 - r10
            if (r23 == 0) goto L_0x023b
            r0 = r27
            r1 = r21
            r2 = r23
            boolean r10 = r0.regionMatches(r7, r1, r10, r2)
            if (r10 != 0) goto L_0x023b
            r11 = -1
        L_0x022a:
            if (r11 < 0) goto L_0x0238
            int r10 = r7 + r11
            if (r10 <= r4) goto L_0x0238
            int r4 = r27.length()
            if (r10 == r4) goto L_0x0248
            r8 = r14
            r4 = r10
        L_0x0238:
            int r10 = r20 + 1
            goto L_0x01ca
        L_0x023b:
            int r11 = r11 + r23
            r0 = r20
            if (r12 == r0) goto L_0x022a
            int r10 = r22.a()
            goto L_0x01f9
        L_0x0246:
            r14 = r8
            r10 = r4
        L_0x0248:
            if (r10 != r7) goto L_0x0260
            r0 = r18
            r0.setErrorIndex(r7)
        L_0x024f:
            int r4 = r18.getIndex()
            r0 = r16
            if (r4 != r0) goto L_0x0266
            r0 = r28
            r1 = r16
            r0.setErrorIndex(r1)
            goto L_0x0002
        L_0x0260:
            r0 = r18
            r0.setIndex(r10)
            goto L_0x024f
        L_0x0266:
            java.lang.Double r4 = java.lang.Double.valueOf(r14)
            r7 = 1
            int r8 = r18.getIndex()
            r25 = r4
            r4 = r8
            r8 = r7
            r7 = r25
            goto L_0x00e6
        L_0x0277:
            boolean r4 = r8.a()
            if (r4 != 0) goto L_0x0281
            bn r4 = defpackage.bn.SELECT
            if (r8 != r4) goto L_0x0289
        L_0x0281:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Parsing of plural/select/selectordinal argument is not supported."
            r4.<init>(r5)
            throw r4
        L_0x0289:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = java.lang.String.valueOf(r8)
            java.lang.String r6 = java.lang.String.valueOf(r5)
            int r6 = r6.length()
            int r6 = r6 + 19
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "unexpected argType "
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L_0x02b0:
            if (r30 == 0) goto L_0x00ec
            r0 = r30
            r0.put(r5, r7)
            goto L_0x00ec
        L_0x02b9:
            r4 = r9
            r7 = r10
            goto L_0x01a9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar.a(java.lang.String, java.text.ParsePosition, java.lang.Object[], java.util.Map):void");
    }

    public final java.lang.Object parseObject(java.lang.String str, java.text.ParsePosition parsePosition) {
        int i2;
        if (this.b.e) {
            java.util.HashMap hashMap = new java.util.HashMap();
            int index = parsePosition.getIndex();
            a(str, parsePosition, (java.lang.Object[]) null, (java.util.Map) hashMap);
            if (parsePosition.getIndex() == index) {
                return null;
            }
            return hashMap;
        } else if (this.b.e) {
            throw new java.lang.IllegalArgumentException("This method is not available in MessageFormat objects that use named argument.");
        } else {
            int i3 = 0;
            int i4 = -1;
            while (true) {
                if (i3 != 0) {
                    i3 = this.b.c(i3);
                }
                while (true) {
                    i3++;
                    defpackage.bp b2 = this.b.b(i3);
                    if (b2 != defpackage.bp.ARG_START) {
                        if (b2 == defpackage.bp.MSG_LIMIT) {
                            i2 = -1;
                            break;
                        }
                    } else {
                        i2 = i3;
                        break;
                    }
                }
                if (i2 < 0) {
                    break;
                }
                int i5 = this.b.a(i2 + 1).d;
                if (i5 <= i4) {
                    i5 = i4;
                }
                i4 = i5;
                i3 = i2;
            }
            java.lang.Object[] objArr = new java.lang.Object[(i4 + 1)];
            int index2 = parsePosition.getIndex();
            a(str, parsePosition, objArr, (java.util.Map) null);
            if (parsePosition.getIndex() == index2) {
                return null;
            }
            return objArr;
        }
    }

    public final int hashCode() {
        return this.b.b.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public final java.text.NumberFormat a() {
        if (this.e == null) {
            this.e = java.text.NumberFormat.getInstance(this.a);
        }
        return this.e;
    }

    private final void a(int i2, defpackage.at atVar, java.lang.Object[] objArr, java.util.Map map, java.lang.Object[] objArr2, defpackage.jd jdVar, java.text.FieldPosition fieldPosition) {
        java.lang.Object obj;
        boolean z;
        java.lang.Object obj2;
        int i3;
        defpackage.au auVar;
        double d2;
        double d3;
        int i4;
        int i5;
        java.lang.String str;
        boolean z2;
        boolean z3;
        int i6;
        java.lang.String str2;
        defpackage.bi biVar;
        int i7;
        java.lang.String str3 = this.b.b;
        int a2 = this.b.a(i2).a();
        int i8 = i2 + 1;
        while (true) {
            defpackage.bo a3 = this.b.a(i8);
            defpackage.bp bpVar = a3.a;
            int i9 = a3.b;
            try {
                jdVar.a.append(str3, a2, i9);
                jdVar.b = (i9 - a2) + jdVar.b;
                if (bpVar != defpackage.bp.MSG_LIMIT) {
                    a2 = a3.a();
                    if (bpVar == defpackage.bp.REPLACE_NUMBER) {
                        if (atVar.h) {
                            jdVar.a(atVar.f, (java.lang.Object) atVar.c, atVar.g);
                        } else {
                            jdVar.a((java.text.Format) a(), (java.lang.Object) atVar.c);
                        }
                    } else if (bpVar == defpackage.bp.ARG_START) {
                        int c2 = this.b.c(i8);
                        defpackage.bn b2 = a3.b();
                        int i10 = i8 + 1;
                        defpackage.bo a4 = this.b.a(i10);
                        java.lang.Object obj3 = 0;
                        java.lang.String a5 = this.b.a(a4);
                        if (objArr != null) {
                            short s = a4.d;
                            if (jdVar.c != null) {
                                obj3 = java.lang.Integer.valueOf(s);
                            }
                            if (s < 0 || s >= objArr.length) {
                                obj = null;
                                obj2 = obj3;
                                z = true;
                            } else {
                                obj = objArr[s];
                                obj2 = obj3;
                                z = false;
                            }
                        } else if (objArr2 != null) {
                            int i11 = 0;
                            while (true) {
                                if (i11 >= objArr2.length) {
                                    obj = null;
                                    z = true;
                                    obj2 = a5;
                                    break;
                                } else if (a5.equals(objArr2[i11].toString())) {
                                    obj = objArr2[i11 + 1];
                                    obj2 = a5;
                                    z = false;
                                    break;
                                } else {
                                    i11 += 2;
                                }
                            }
                        } else if (map == null || !map.containsKey(a5)) {
                            obj = null;
                            z = true;
                            obj2 = a5;
                        } else {
                            obj = map.get(a5);
                            obj2 = a5;
                            z = false;
                        }
                        int i12 = i10 + 1;
                        int i13 = jdVar.b;
                        if (z) {
                            jdVar.a((java.lang.CharSequence) new java.lang.StringBuilder(java.lang.String.valueOf(a5).length() + 2).append("{").append(a5).append("}").toString());
                        } else if (obj == null) {
                            jdVar.a((java.lang.CharSequence) "null");
                        } else if (atVar == null || atVar.e != i12 - 2) {
                            if (this.c != null) {
                                java.text.Format format = (java.text.Format) this.c.get(java.lang.Integer.valueOf(i12 - 2));
                                if (format != null) {
                                    jdVar.a(format, obj);
                                }
                            }
                            if (b2 == defpackage.bn.NONE || (this.c != null && this.c.containsKey(java.lang.Integer.valueOf(i12 - 2)))) {
                                if (obj instanceof java.lang.Number) {
                                    jdVar.a((java.text.Format) a(), obj);
                                } else if (obj instanceof java.util.Date) {
                                    if (this.d == null) {
                                        this.d = java.text.DateFormat.getDateTimeInstance(3, 3, this.a);
                                    }
                                    jdVar.a((java.text.Format) this.d, obj);
                                } else {
                                    jdVar.a((java.lang.CharSequence) obj.toString());
                                }
                            } else if (b2 == defpackage.bn.CHOICE) {
                                if (!(obj instanceof java.lang.Number)) {
                                    java.lang.String valueOf = java.lang.String.valueOf(obj);
                                    throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 18).append("'").append(valueOf).append("' is not a Number").toString());
                                }
                                double doubleValue = ((java.lang.Number) obj).doubleValue();
                                defpackage.bl blVar = this.b;
                                int size = blVar.c.size();
                                int i14 = i12 + 2;
                                while (true) {
                                    int c3 = blVar.c(i14) + 1;
                                    if (c3 >= size) {
                                        break;
                                    }
                                    int i15 = c3 + 1;
                                    defpackage.bo a6 = blVar.a(c3);
                                    if (a6.a == defpackage.bp.ARG_LIMIT) {
                                        break;
                                    }
                                    double b3 = blVar.b(a6);
                                    int i16 = i15 + 1;
                                    if (blVar.b.charAt(((defpackage.bo) blVar.c.get(i15)).b) != '<') {
                                        if (doubleValue < b3) {
                                            break;
                                        }
                                    } else if (doubleValue <= b3) {
                                        break;
                                    }
                                    i14 = i16;
                                }
                                a(i14, null, objArr, map, objArr2, jdVar);
                            } else if (b2.a()) {
                                if (!(obj instanceof java.lang.Number)) {
                                    java.lang.String valueOf2 = java.lang.String.valueOf(obj);
                                    throw new java.lang.IllegalArgumentException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf2).length() + 18).append("'").append(valueOf2).append("' is not a Number").toString());
                                }
                                if (b2 == defpackage.bn.PLURAL) {
                                    if (this.f == null) {
                                        this.f = new defpackage.au(this, defpackage.bg.a);
                                    }
                                    auVar = this.f;
                                } else {
                                    if (this.g == null) {
                                        this.g = new defpackage.au(this, defpackage.bg.b);
                                    }
                                    auVar = this.g;
                                }
                                java.lang.Number number = (java.lang.Number) obj;
                                defpackage.bl blVar2 = this.b;
                                defpackage.bo boVar = (defpackage.bo) blVar2.c.get(i12);
                                if (boVar.a.a()) {
                                    d2 = blVar2.b(boVar);
                                } else {
                                    d2 = 0.0d;
                                }
                                defpackage.at atVar2 = new defpackage.at(i12, a5, number, d2);
                                defpackage.bl blVar3 = this.b;
                                double doubleValue2 = number.doubleValue();
                                int size2 = blVar3.c.size();
                                defpackage.bo a7 = blVar3.a(i12);
                                if (a7.a.a()) {
                                    i12++;
                                    d3 = blVar3.b(a7);
                                } else {
                                    d3 = 0.0d;
                                }
                                java.lang.String str4 = null;
                                boolean z4 = false;
                                int i17 = 0;
                                while (true) {
                                    int i18 = i12 + 1;
                                    defpackage.bo a8 = blVar3.a(i12);
                                    if (a8.a == defpackage.bp.ARG_LIMIT) {
                                        i4 = i17;
                                        break;
                                    }
                                    if (blVar3.b(i18).a()) {
                                        int i19 = i18 + 1;
                                        if (doubleValue2 == blVar3.b(blVar3.a(i18))) {
                                            i5 = i19;
                                            break;
                                        }
                                        i18 = i19;
                                        i4 = i17;
                                        str = str4;
                                        z2 = z4;
                                    } else {
                                        if (!z4) {
                                            if (!blVar3.a(a8, "other")) {
                                                if (str4 == null) {
                                                    double d4 = doubleValue2 - d3;
                                                    if (auVar.b == null) {
                                                        auVar.b = defpackage.av.a(auVar.a.a, auVar.c);
                                                    }
                                                    defpackage.at atVar3 = atVar2;
                                                    defpackage.ar arVar = auVar.a;
                                                    int i20 = atVar3.a;
                                                    int size3 = arVar.b.c.size();
                                                    if (arVar.b.a(i20).a.a()) {
                                                        i20++;
                                                    }
                                                    while (true) {
                                                        i6 = i20 + 1;
                                                        defpackage.bo a9 = arVar.b.a(i20);
                                                        if (a9.a != defpackage.bp.ARG_LIMIT) {
                                                            if (arVar.b.a(a9, "other")) {
                                                                break;
                                                            }
                                                            if (arVar.b.b(i6).a()) {
                                                                i7 = i6 + 1;
                                                            } else {
                                                                i7 = i6;
                                                            }
                                                            i20 = arVar.b.c(i7) + 1;
                                                            if (i20 >= size3) {
                                                                break;
                                                            }
                                                        } else {
                                                            break;
                                                        }
                                                    }
                                                    i6 = 0;
                                                    defpackage.ar arVar2 = auVar.a;
                                                    java.lang.String str5 = atVar3.b;
                                                    int i21 = i6 + 1;
                                                    while (true) {
                                                        defpackage.bo a10 = arVar2.b.a(i21);
                                                        defpackage.bp bpVar2 = a10.a;
                                                        if (bpVar2 == defpackage.bp.MSG_LIMIT) {
                                                            i21 = 0;
                                                            break;
                                                        } else if (bpVar2 == defpackage.bp.REPLACE_NUMBER) {
                                                            i21 = -1;
                                                            break;
                                                        } else {
                                                            if (bpVar2 == defpackage.bp.ARG_START) {
                                                                defpackage.bn b4 = a10.b();
                                                                if (str5.length() != 0 && (b4 == defpackage.bn.NONE || b4 == defpackage.bn.SIMPLE)) {
                                                                    if (arVar2.b.a(arVar2.b.a(i21 + 1), str5)) {
                                                                        break;
                                                                    }
                                                                }
                                                                i21 = arVar2.b.c(i21);
                                                            }
                                                            i21++;
                                                        }
                                                    }
                                                    atVar3.e = i21;
                                                    if (atVar3.e > 0 && auVar.a.c != null) {
                                                        atVar3.f = (java.text.Format) auVar.a.c.get(java.lang.Integer.valueOf(atVar3.e));
                                                    }
                                                    if (atVar3.f == null) {
                                                        atVar3.f = auVar.a.a();
                                                        atVar3.h = true;
                                                    }
                                                    atVar3.g = atVar3.f.format(atVar3.c);
                                                    defpackage.bj bjVar = auVar.b.a;
                                                    defpackage.bb bbVar = new defpackage.bb(d4);
                                                    if (java.lang.Double.isInfinite(bbVar.a) || java.lang.Double.isNaN(bbVar.a)) {
                                                        str2 = "other";
                                                    } else {
                                                        java.util.Iterator it = bjVar.b.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                biVar = null;
                                                                break;
                                                            }
                                                            biVar = (defpackage.bi) it.next();
                                                            if (biVar.b.a(bbVar)) {
                                                                break;
                                                            }
                                                        }
                                                        str2 = biVar.a;
                                                    }
                                                    if (i17 == 0 || !str2.equals("other")) {
                                                        str4 = str2;
                                                        z3 = z4;
                                                    } else {
                                                        str4 = str2;
                                                        z3 = true;
                                                    }
                                                } else {
                                                    z3 = z4;
                                                }
                                                if (z3 || !blVar3.a(a8, str4)) {
                                                    int i22 = i17;
                                                    str = str4;
                                                    z2 = z3;
                                                    i4 = i22;
                                                } else {
                                                    str = str4;
                                                    z2 = true;
                                                    i4 = i18;
                                                }
                                            } else if (i17 == 0) {
                                                if (str4 == null || !str4.equals("other")) {
                                                    i4 = i18;
                                                    str = str4;
                                                    z2 = z4;
                                                } else {
                                                    str = str4;
                                                    z2 = true;
                                                    i4 = i18;
                                                }
                                            }
                                        }
                                        i4 = i17;
                                        str = str4;
                                        z2 = z4;
                                    }
                                    int c4 = blVar3.c(i18) + 1;
                                    if (c4 >= size2) {
                                        break;
                                    }
                                    z4 = z2;
                                    str4 = str;
                                    i17 = i4;
                                    i12 = c4;
                                }
                                i5 = i4;
                                a(i5, atVar2, objArr, map, objArr2, jdVar);
                            } else if (b2 == defpackage.bn.SELECT) {
                                defpackage.bl blVar4 = this.b;
                                java.lang.String obj4 = obj.toString();
                                int size4 = blVar4.c.size();
                                int i23 = 0;
                                while (true) {
                                    int i24 = i12 + 1;
                                    defpackage.bo a11 = blVar4.a(i12);
                                    if (a11.a != defpackage.bp.ARG_LIMIT) {
                                        if (!blVar4.a(a11, obj4)) {
                                            if (i23 == 0 && blVar4.a(a11, "other")) {
                                                i23 = i24;
                                            }
                                            i12 = blVar4.c(i24) + 1;
                                            if (i12 >= size4) {
                                                break;
                                            }
                                        } else {
                                            i3 = i24;
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                                i3 = i23;
                                a(i3, null, objArr, map, objArr2, jdVar);
                            } else {
                                java.lang.String valueOf3 = java.lang.String.valueOf(b2);
                                throw new java.lang.IllegalStateException(new java.lang.StringBuilder(java.lang.String.valueOf(valueOf3).length() + 19).append("unexpected argType ").append(valueOf3).toString());
                            }
                        } else if (atVar.d == 0.0d) {
                            jdVar.a(atVar.f, (java.lang.Object) atVar.c, atVar.g);
                        } else {
                            jdVar.a(atVar.f, obj);
                        }
                        if (jdVar.c != null && i13 < jdVar.b) {
                            jdVar.c.add(new defpackage.lf(obj2, i13, jdVar.b));
                        }
                        if (fieldPosition != null && defpackage.as.a.equals(fieldPosition.getFieldAttribute())) {
                            fieldPosition.setBeginIndex(i13);
                            fieldPosition.setEndIndex(jdVar.b);
                            fieldPosition = null;
                        }
                        a2 = this.b.a(c2).a();
                        i8 = c2;
                    } else {
                        continue;
                    }
                    i8++;
                } else {
                    return;
                }
            } catch (java.io.IOException e2) {
                throw new defpackage.bs(e2);
            }
        }
    }

    private final void a(int i2, defpackage.at atVar, java.lang.Object[] objArr, java.util.Map map, java.lang.Object[] objArr2, defpackage.jd jdVar) {
        if (!(this.b.a == defpackage.bm.a)) {
            a(i2, atVar, objArr, map, objArr2, jdVar, null);
            return;
        }
        throw new java.lang.UnsupportedOperationException("JDK apostrophe mode not supported");
    }

    private final void a(java.lang.Object obj, defpackage.jd jdVar, java.text.FieldPosition fieldPosition) {
        if (obj == null || (obj instanceof java.util.Map)) {
            a((java.lang.Object[]) null, (java.util.Map) obj, jdVar, fieldPosition);
        } else {
            a((java.lang.Object[]) obj, (java.util.Map) null, jdVar, fieldPosition);
        }
    }

    private final void a(java.lang.Object[] objArr, java.util.Map map, defpackage.jd jdVar, java.text.FieldPosition fieldPosition) {
        if (objArr == null || !this.b.e) {
            a(0, null, objArr, map, null, jdVar, fieldPosition);
            return;
        }
        throw new java.lang.IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
    }

    private static final int a(java.lang.String str, java.lang.String[] strArr) {
        java.lang.String lowerCase = defpackage.ap.a(str).toLowerCase(k);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (lowerCase.equals(strArr[i2])) {
                return i2;
            }
        }
        return -1;
    }
}
