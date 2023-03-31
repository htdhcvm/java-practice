package com.dsa.app.data_structure;


import java.util.*;

public class ArrayListPractice{
    public static void main(String[] args)
    {
//        ArrayList<String> arrString = new ArrayList<>();
//        arrString.add("1");
//        arrString.add("2");
//        arrString.add("3");
//
//        arrString.set(1, "4");
//
//        System.out.println(arrString);
//
//        for (String item:arrString) {
//            System.out.println("item: " + item);
//        }

        // ---------------------------------------------------------------
//        ArrayList<Person> personList = new ArrayList<>();
//
//        personList.add(new Person("1", "1"));
//        personList.add(new Person("2", "2"));
//        personList.add(new Person("3", "3"));
//        personList.add(new Person("4", "4"));
//        System.out.println(personList);
//        personList.remove(new Person("4", "4"));
//        System.out.println(personList);
//        System.out.println("Size: " + personList.size());
//        // ---------------------------------------------------------------

//        ArrayList<Person> personList1 = new ArrayList<>();

//        personList1.add(new Person("1", "1"));
//        personList1.add(new Person("2", "2"));
//
//        ArrayList<Person> personList2 = new ArrayList<>();
//
//        personList2.add(new Person("3", "3"));
//        personList2.add(new Person("4", "4"));
//        personList2.add(new Person("5", "5"));
//
//        System.out.println("personList1 -" + personList1);
//        System.out.println("personList2 - " + personList2);
//
//        personList1.addAll(personList2);
//
//        System.out.println("personList1All - " + personList1);

//        personList1.addAll(1, personList2);
//        System.out.println("personList1All - " + personList1);
//
//        final int index = personList1.indexOf(new Person("5", "5")); // находит первое вхождение
//        System.out.println("index - " + index);
//
//        final int notFoundIndex = personList1.indexOf(new Person("10", "10")); // находит первое вхождение
//        System.out.println("notFoundIndex - " + notFoundIndex);
//
//        final int lastIndex = personList1.lastIndexOf(new Person("5", "5")); // находит первое вхождение
//        System.out.println("lastIndex - " + lastIndex);
//
//
//        final boolean isContain = personList1.contains(new Person("5", "5")); // находит первое вхождение
//        System.out.println("isContain - " + isContain);
//
//        personList1.clear();
//        System.out.println("personList1All - " + personList1);
        // ---------------------------------------------------------------
//        StringBuilder sb1 = new StringBuilder("1");
//        StringBuilder sb2 = new StringBuilder("2");
//        StringBuilder sb3 = new StringBuilder("3");
//        StringBuilder sb4 = new StringBuilder("4");
//
//        StringBuilder[] arr = {sb1, sb2, sb3, sb4};
//        List<StringBuilder> listArr = Arrays.asList(arr);
//        arr.hashCode();
//        System.out.println(arr);
//
//
//
//        System.out.println(listArr);

//        System.out.println(listArr);
//
//        arr[0].append("qwer");
//        System.out.println(listArr);
//
//
//        ArrayList<StringBuilder> listArrq = new ArrayList<>();
//        StringBuilder sb5 = new StringBuilder("3");
//        StringBuilder sb6 = new StringBuilder("4");
//
//        listArrq.add(sb5);
//        listArrq.add(sb6);
//
//
//        ArrayList<StringBuilder> listArrqA = new ArrayList<>();
//        StringBuilder sb7 = new StringBuilder("3");
//        StringBuilder sb8 = new StringBuilder("4");
//
//        listArrqA.add(sb7);
//        listArrqA.add(sb8);
//
//
//
//        listArrq.removeAll(listArrqA);
//
//        System.out.println(listArrq);
//
//
//        ArrayList<String> ar = new ArrayList<>();
//        ArrayList<String> ar1 = new ArrayList<>();
//
//        ar.add("1");
//        ar.add("2");
//        ar.add("3");
//
//        ar1.add("1");
//        ar1.add("3");
//
//        System.out.println(ar);
//        ar.removeAll(ar1);
//        System.out.println(ar);

//        String[] arr8 = {"1", "2", "3"};
//        List<String> l = Arrays.asList(arr8);

//        ArrayList<String> l3 = new ArrayList();
//        l3.add("3");
//
//        ArrayList<String> l2 = new ArrayList();
//        l2.add("3");
//
//        System.out.println(l);
//        l3.removeAll(l2);
//        System.out.println(l3);
//
//        final boolean q = l.containsAll(l2);
//        System.out.println(q);

        // ---------------------------------------------------------------

//        ArrayList<String> arrList1= new ArrayList<>();
//        arrList1.add("111");
//        arrList1.add("211");
//        arrList1.add("311");
//
//        final List<String> arrList1View = arrList1.subList(0, 2);
//
//        System.out.println(arrList1);
//        System.out.println(arrList1View);
//
//        arrList1View.add("444");
//
//        System.out.println(arrList1);
//        System.out.println(arrList1View);
//
//        Object[] ar = arrList1View.toArray();
//        String[] ar2 = arrList1View.toArray(new String[3]);
//        System.out.println(Arrays.toString(ar));

        // ---------------------------------------------------------------

//        List<Integer> list1 = List.of(1, 2, 3);
//        list1.add(3);


        // ---------------------------------------------------------------

//        ArrayList<String> asdf = new ArrayList<>();
//        asdf.add("111");
//        asdf.add("211");
//        asdf.add("311");
//
//        List<String> wer = List.copyOf(asdf);
//        System.out.println(wer);



//        String[] arr8 = {"1", "2", "3"};
//        List<String> l = Arrays.asList(arr8);



//        List<String> l2 = new ArrayList<>();
//        l2.add("1");
//        l2.add("2");
//        l2.add("3");
//
//        System.out.println(l2.getClass());
//
//        List<String> l3 = new ArrayList<>();
//
//        l3.add("2");
//
//        l.removeAll(l3);
//
//        System.out.println(l2);

//        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        ArrayList<Integer> list2 = new ArrayList<>();
//        ArrayList<Integer> list3 = new ArrayList<>(300); // Задается initialCapacity
//        ArrayList<Integer> list4 = new ArrayList<>(list1);
//
//
//        ArrayList<Integer> list5 = new ArrayList();


//        List<String> list1 = new ArrayList<>();
//        List<String> list2 = new ArrayList<>();
//
//        List<String> list3 = new LinkedList<>();
//
//        Set<String> set = new HashSet<>();
//
//        list1.add("1");
//        list1.add("2");
//        list1.add("3");
//        list1.add("4");
//
//        list2.add("5");
//        list2.add("6");
//
//        list3.add("7");
//        list3.add("8");
//        set.add("1234");
//
//        System.out.println("list1: " + list1);
//        System.out.println("list2: " + list2);
//
//        list2.addAll(1, list1);
//        list2.addAll(1, list3);
//        list2.addAll(1, set);
//
//        System.out.println("list1: " + list1);
//        System.out.println("list2: " + list2);

//        ArrayList<String> s = new ArrayList<>();
//        s.add("1");
//        s.add("1");
//        s.add("1");
//
//        System.out.println(s.indexOf("1"));

        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(1);
        l2.add(2);
        l2.add(3);

        List<ArrayList<Integer>> q = List.of(l, l2);
        System.out.println(q);;
        System.out.println(List.copyOf(l));;
    }
}
