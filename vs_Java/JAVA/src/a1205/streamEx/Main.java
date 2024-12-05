package a1205.streamEx;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");
        List<Transaction> transaction = Arrays.asList(
                new Transaction(brian, 2011, 300), new Transaction(raoul, 2012, 1000), new Transaction(alan, 2011, 400),
                new Transaction(mario, 2012, 700), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));
        // brian, mario 거래자 // Cambridge 거래자 근무 도시

        // 1.문제 2011년에 일어난 모든 트랜재션을 찾아 오름차순으로 정렬하시오
        practice1(transaction);
        // 2.문제 거래자가 근무하는 모든 도시를 중복 없이 나열하시오
        practice2(transaction);
        // 3.문제 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
        practice3(transaction);
        // 4.문제 밀라노에 거래자가 있는지 확인 하시오
        practice4(transaction);
        // 5.문제 케임브릿지에 거주하는 거래자의 모든 트랜잭션 값을 출력하시오
        practice5(transaction);
        // 6.문제 모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오
        practice6(transaction);
        // 7.문제 전체 트랜잭션 중 최댓값은 얼마인가?
        practice7(transaction);
        // 8.문제 전체 트랜잭션 중 최소값은 얼마인가?
        practice8(transaction);

    }

    // 1.문제 2011년에 일어난 모든 트랜재션을 찾아 오름차순으로 정렬하시오
    private static void practice1(List<Transaction> transaction) {
        List<Transaction> result = transaction.stream()
                .filter(t -> 2011 == t.getYear())
                .sorted(Comparator.comparing(Transaction::getValue)) // 값을 뽑아서 정렬
                .collect(Collectors.toList()); // Collect 를 toList로 변환
        System.out.println(result);
        // .sorted(Comparator.comparing(Transaction::getValue).reversed())//내림차순
        // .sorted((tran1, tran2) -> Integer.compare(tran1.getValue(),
        // tran2.getValue()))
    }

    // 2.거래자가 근무하는 모든 도시를 중복없이 나열하시오
    private static void practice2(List<Transaction> transactions) {
        List<String> result = transactions.stream()
                .map((tran) -> tran.getTrader().getCity())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(result);
    }
    // tran(transactions) 객체를 입력받아서
    // .map(Transaction::getTrader) //각 거래에서 거래자 객체를 추출
    // .map(Trader::getCity) //각 거래자에서 도시정보추출

    // 3. 케임브리지에서 근무하는 모든 거래자를 찾아서 이름순으로 정렬하시오
    private static void practice3(List<Transaction> transaction) {
        List<Trader> result = transaction.stream()
                .map(Transaction::getTrader)
                .filter(trader -> ("Cambridge").equals(trader.getCity()))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());
        System.out.println(result);
    }

    // 4.문제 밀라노에 거래자가 있는지 확인 하시오
    private static void practice4(List<Transaction> transaction) {
        boolean result = transaction.stream()
                .anyMatch(tran -> "Milan".equals(tran.getTrader().getCity()));
        System.out.println(result);
    }

    // 5.문제 케임브릿지에 거주하는 거래자의 모든 트랜잭션 값을 출력하시오
    private static void practice5(List<Transaction> transactions) {
        List<Transaction> result = transactions.stream()
                .filter(tran -> "Cambridge".equals(tran.getTrader().getCity()))
                .collect(Collectors.toList());
        System.out.println(result);
    }

    // 6.문제 모든 거래자의 이름을 알파벳 순으로 정렬해서 반환하시오
    private static void practice6(List<Transaction> transaction) {
        String result = transaction.stream()
                .map(Transaction::getTrader)
                .map(Trader::getName)
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(result);
    }

    // 7.문제 전체 트랜잭션 중 최댓값은 얼마인가?
    private static void practice7(List<Transaction> transactions) {
        Optional<Transaction> result = transactions.stream()
                .max(Comparator.comparing(Transaction::getValue));
        System.out.println(result.get().getValue());
    }   // Optional은 .get()으로 값을 꺼내올수 있다.
    

    // 8.문제 전체 트랜잭션 중 최소값은 얼마인가?
    private static void practice8(List<Transaction> transactions) {
        Optional<Transaction> result = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));

        System.out.println(result.get().getValue());
    }

}
