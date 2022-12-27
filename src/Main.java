public class Main {
    public static void main(String[] args) {

        // Pasamos un int a Integer (conversión).
        // Hacemos lo mismo con los demás.
        int a = 10;
        System.out.println(a);
        Integer b = Integer.valueOf(a);
        System.out.println(b);

        System.out.println("-----------------------------------------------------");

        float c = b.floatValue();
        System.out.println(c);
        Float d = Float.valueOf(c);
        System.out.println(d);

        System.out.println("-----------------------------------------------------");

        double e = d.doubleValue();
        System.out.println(e);
        Double f = Double.valueOf(e);
        System.out.println(f);

        System.out.println("-----------------------------------------------------");

        byte g = f.byteValue();
        System.out.println(g);
        Byte h = Byte.valueOf(g);
        System.out.println(h);

        System.out.println("-----------------------------------------------------");

        short i = h.shortValue();
        System.out.println(i);
        Short j = Short.valueOf(i);
        System.out.println(j);

        System.out.println("-----------------------------------------------------");

        long k = j.longValue();
        System.out.println(k);
        Long l = Long.valueOf(k);
        System.out.println(l);

        System.out.println("-----------------------------------------------------");

        char m = 'a';
        System.out.println(m);
        Character n = Character.valueOf(m);
        System.out.println(n);

        System.out.println("-----------------------------------------------------");

        boolean o = true;
        System.out.println(o);
        Boolean p = Boolean.valueOf(o);
        System.out.println(p);
        boolean q = p.booleanValue(); // Esto se puede hacer con todos. Con el booleanValue() (o lo que corresponda, como charValue() por ejemplo para los char). Pasas de la clase Wrapper al tipo primitivo de nuevo.
        System.out.println(q);

        System.out.println("-----------------------------------------------------");

        // Pasar String a entero.
        String numero = "5";
        System.out.println(numero);
        int numero2 = Integer.parseInt(numero);
        System.out.println(numero2);
        Integer numero3 = Integer.valueOf(numero2); // Pasamos numero2 que es un int a su clase Wrapper Integer para hacer lo de a continuación...
        String numero4 = numero3.toString(); // numero3 al ser Wrapper, se le puede aplicar el método toString(), y así pasamos un número a String.

        System.out.println("-----------------------------------------------------");

        // Utilizamos Métodos.
        Integer gh = 76;
        System.out.println(Integer.min(b,gh)); // Te saca cuál es el mínimo entre la variable b y gh. Obviamente es 10 porque es menor que 76.
        System.out.println(Integer.max(b,gh)); // Te saca cuál es el máximo entre la variable b y gh. Obviamente es 76 porque es mayor que 10.
        System.out.println(Integer.MIN_VALUE); // Te saca el valor mínimo que puede albergar un Integer. Aplicable a todos los demás tipos de datos.
        System.out.println(Integer.MAX_VALUE); // Te saca el valor máximo que puede albergar un Integer. Aplicable a todos los demás tipos de datos.

        System.out.println("-----------------------------------------------------");

        // Parte del profesor
        Integer ii = Integer.valueOf(123456);
        //Integer ii = 123456;
        Integer ee = 123456;
        System.out.println(ee == ii);
        System.out.println("ii = " + ii);
        String ss = ii.toString();
        System.out.println("ss = " + ss);
        int jj = ii.intValue();
        long ll = ii.longValue();
        float ff = ii.floatValue();
        double dd = ii.doubleValue();
        int kk = Integer.parseInt("1223141");
        System.out.println("To HEX = " + Integer.toHexString(1241234));
        System.out.println("To OCT = " + Integer.toOctalString(1241234));
        System.out.println("To BIN = " + Integer.toBinaryString(13213));

        // Long
        Long varlong = 123525646464L;
        String str = varlong.toString();
        dd = varlong.doubleValue();
        long vlong = Long.parseLong("4534547456");
        System.out.println("bits = " + Long.bitCount(1239120309));

        // Char
        Character cc = Character.valueOf('1');
        System.out.println("charValue() " + cc.charValue());
        System.out.println("isDigit " + cc.isDigit(cc));
        char bb = 'D';
        System.out.println("isDigit " + Character.isDigit(bb));
        System.out.println("valueOf " + Character.valueOf(bb));
        bb = Character.toLowerCase(bb);
        System.out.println("toLowerCase " + Character.toLowerCase(bb));
        System.out.println("isLowerCase " + Character.isLowerCase(bb));
    }
}