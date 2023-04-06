import java.util.StringTokenizer;

public class Address {

    final private String country, region, city, street, house, housing, flat;

    public Address(String address, boolean isMultiDivider){
        if(address == null) throw new NullPointerException();
        String[] s;
        if(isMultiDivider){
            StringTokenizer st = new StringTokenizer(address, ",.;");
            s = new String[st.countTokens()];
            int i = 0;
            while(st.hasMoreTokens())
                s[i++] = st.nextToken();
        }else
            s = address.split(",");
        if(s.length < 7)
            throw new IllegalArgumentException("Incorrect address");
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        housing = s[5].trim();
        flat = s[6].trim();
    }

    @Override
    public String toString() {
        return "Адрес:\n" +
                "  Страна: " + country + '\n' +
                "  Регион: " + region + '\n' +
                "  Город: " + city + '\n' +
                "  Улица: " + street + '\n' +
                "  Дом: " + house + '\n' +
                "  Строение: " + housing + '\n' +
                "  Квартира: " + flat + '\n';
    }


    public static void main(String [] args){
        Address first = new Address("Россия, Московская область, Москва, улица 1-й Нагатинский проезд, 14, 2, 54", false);
        Address second = new Address("Россия, Московская область. Москва; улица 1-й Нагатинский проезд; 43, 2. 54", true);
        System.out.println(first);
        System.out.println(second);
        Address third = new Address("Россия, Московская область, 123", false);
        System.out.println(third);
    }
}
