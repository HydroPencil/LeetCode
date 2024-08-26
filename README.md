# LeetCode Study
`
- LeetCode 코딩 테스트 문제를 해결하고 저장하는 레포지토리
## 기존 문제점
***
![sreensh](src/main/resources/img/LeetCodeScreenShot.PNG)
- 풀이한 문제를 정리하지 않아 추후 복습시 찾아가는 것이 쉽지 않음
- 정리한 내용을 외부 불로그를 활용하는 등 관리할 매체가 늘어남에 따라 불편함이 생김

## 목표
***
- 기존 공부법에서 풀이한 문제들에 대한 정리가 되어있지 않은 부부을 해결하고자 함
- 문제 해결을 습관하 하기 위함
- 꾸준히 키우는 것을 목표로 함

## 공부 방식
***
- 1일 2문제씩 시간 제한을 설정하여 문제를 물이
- 문제 풀이 후 어려웠던 점이나 개선할 사항을 코멘트로 작성
- 50문제 단위로 3번 반복하여 3회독, 반복하면서 시간단축과 개선사항을 고민
- 3회독 후 50문제를 풀고 3회독 반복하는 방식

## 문제 풀이 현황 및 문제 코멘트
### 2024.08.02 ~
<details>
<summary>1회독(50문제)</summary>
<br>

| 문제	                                                          | 난이도  | 걸린시간 | 제한시간	 |     날짜     | 코멘트                                                                                        |
|:-------------------------------------------------------------|:----:|:----:|:-----:|:----------:|:-------------------------------------------------------------------------------------------|
| 1. Two Sum                                                   | easy |  11  |  25   | 2024/08/02 |                                                                                            |
| 21. PalindromeNumber                                         | easy |  19  |  25   | 2024/08/02 |                                                                                            |
| 14. Longest Common Prefix                                    | easy |  12  |  25   | 2024/08/03 |                                                                                            |
| 21. Merge Two Sorted Lists                                   | easy |  TO  |  25   | 2024/08/03 | 리스트 자료의 특성을 잘 생각해서 풀어보자                                                                    |
| 14. SqrtX                                                    | easy |  23  |  25   | 2024/08/04 | 이진 탐색을 너무 늦게 생각했다                                                                          |
| 190. Reverse Bits                                            | easy |  12  |  25   | 2024/08/04 | 비트 연산자를 빠르게 생각해 내서 쉽게 풀었음                                                                  |
| 441. Arranging Coins                                         | easy |  15  |  25   | 2024/08/05 | 수학적 접근                                                                                     |
| 530. MinimumAbsoluteDifferenceInBST                          | easy |  21  |  25   | 2024/08/05 |                                                                                            |
| 2053. Kth Distinct String in an Array                        | easy |  20  |  25   | 2024/08/06 | 문제 해석에서 시간 소요, 맵 자료구조 하나로 해결 가능해 보임                                                        |
| 2144. Minimum Cost Of Buying Candies With Discount           | easy |  11  |  25   | 2024/08/06 | 내림 차순 배열을 생각하다 3의 배수를 의미하는 변수를 추가함으로써 더 간결하게 구현하였음                                         |
| 1822. Sign of the Product of an Array                        | easy |  6   |  25   | 2024/08/07 | 초기에 자료형의 메모리를 고려하지 않고 설계하다가 오버플로우 발생                                                       |
| 2129. Capitalize the Title                                   | easy |  22  |  25   | 2024/08/07 | 마지막 공백(" ") 제거를 유의해야 한다                                                                    |
| 2716. Minimize String Length                                 | easy |  7   |  25   | 2024/08/08 |                                                                                            |
| 1827. Minimum Operations to Make the Array Increasing        | easy |  6   |  25   | 2024/08/08 |                                                                                            |
| 1518. Water Bottles                                          | easy |  8   |  25   | 2024/08/09 |                                                                                            |
| 559. Maximum Depth of N-ary Tree                             | easy |  15  |  25   | 2024/08/09 | 트리에서 문제해결 할 때 경게값에서 문제가 발생(뿌리, 잎)하는 것을 조심하자                                                |
| 674. Longest Continuous Increasing Subsequence               | easy |  20  |  25   | 2024/08/10 |                                                                                            |
| 680. Valid Palindrome II                                     | easy |  15  |  25   | 2024/08/10 | 회문 문제의 한 유형.                                                                               |
| 3079. Find the Sum of Encrypted Integers                     | easy |  22  |  25   | 2024/08/11 |                                                                                            |
| 2974. Minimum Number Game                                    | easy |  20  |  25   | 2024/08/11 |                                                                                            |
| 703. Kth Largest Element In a Stream                         | easy |  TO  |  25   | 2024/08/12 | nums가 비어있는 경우, k가 nums의 크기보다 작은 경우 등, 처리해야할 경우의 수가 많았다. 우선순위 queue자료 구조를 활용하면 더 쉽게 풀릴것 같다. |
| 1791. Find Center Of Star Graph                              | easy |  10  |  25   | 2024/08/12 |                                                                                            |
| 1967. Number of Strings That Appear as Substrings in Word    | easy |  6   |  25   | 2024/08/13 | 성능이 않좋게 나왔다. String에서 지원하는 메소드를 그대로 쓴 이유. 다음에는 다른 방식으로 풀 것                                 |
| 2180. Count Integers With Even Digit Sum                     | easy |  17  |  25   | 2024/08/13 |                                                                                            |
| 110. Balanced Binary Tree                                    | easy |  23  |  25   | 2024/08/14 |                                                                                            |
| 145. Binary Tree Postorder Traversal                         | easy |  17  |  25   | 2024/08/14 |                                                                                            |
| 860. Lemonade Change                                         | easy |  20  |  25   | 2024/08/15 |                                                                                            |
| 1636. Sort Array by Increasing Frequency                     | easy |  17  |  25   | 2024/08/15 |                                                                                            |
| 1784. Check if Binary String Has at Most One Segment of Ones | easy |  15  |  25   | 2024/08/16 |                                                                                            |
| 1903. Largest Odd Number in String                           | easy |  7   |  25   | 2024/08/16 |                                                                                            |
| 1437. Check If All 1's Are at Least Length K Places Away     | easy |  16  |  25   | 2024/08/17 | 분기문을 설정하는 사고력을 요구하는 문제였다.                                                                  |
| 1534. Count Good Triplets                                    | easy |  10  |  25   | 2024/08/17 |                                                                                            |
| 594. Longest Harmonious Subsequence                          | easy |  23  |  25   | 2024/08/18 | 조건 분기를 신경써야 할 게 많아서 다른 방법을 고민. Map자료구조를 사용하면서 편하게 해결                                       |
| 509. Fibonacci Number                                        | easy |  10  |  25   | 2024/08/18 |                                                                                            |
| 3194. Minimum Average of Smallest and Largest Elements       | easy |  5   |  25   | 2024/08/19 |                                                                                            |
| 2810. Faulty Keyboard                                        | easy |  12  |  25   | 2024/08/19 | Stringbuilder 내용을 공부                                                                       |
| 2264. Largest 3-Same-Digit Number in String                  | easy |  5   |  25   | 2024/08/20 |                                                                                            |
| 2335. Minimum Amount of Time to Fill Cups                    | easy |  22  |  25   | 2024/08/20 | 조건 분기를 생각하는데 시간이 걸림                                                                        |
| 2255. Count Prefixes of a Given String                       | easy |  15  |  25   | 2024/08/21 | String 객체의 startsWith()메소드를 응용함                                                            |
| 2437. Number of Valid Clock Times                            | easy |  10  |  25   | 2024/08/21 |                                                                                            |
| 476. Number Complement                                       | easy |  20  |  25   | 2024/08/22 | 논리 연산자로 해결하려 했으나 수학적 기법으로 해결하는 것이 더 간편함을 중간에 깨달음                                           |
| 2582. Pass the Pillow                                        | easy |  8   |  25   | 2024/08/22 |                                                                                            |
| 1189. Maximum Number of Ballons                              | easy |  11  |  25   | 2024/08/23 |                                                                                            |
| 1480. Running Sum of 1d Array                                | easy |  3   |  25   | 2024/08/23 |                                                                                            |
| 2099. Find Subsequence of Length K With the Largest Sum      | easy |  TO  |  25   | 2024/08/24 | 기존배열을 무너뜨리지 않기 위한 조치로 우선순위큐 자료구조를 사용하는 것을 배웠음                                              |
| 1844. Replace All Digits with Characters                     | easy |  19  |  25   | 2024/08/24 |                                                                                            |
| 3136. Valid Word                                             | easy |  23  |  25   | 2024/08/25 |                                                                                            |
| 3142. Check if Grid Satisfies Conditions                     | easy |  12  |  25   | 2024/08/25 |                                                                                            |
| 590. N-ary Tree Postorder Traversal                          | easy |  19  |  25   | 2024/08/26 | 깊이 우선탐색을 활용                                                                                |
| 1046. Last Stone Weight                                      | easy |  12  |  25   | 2024/08/26 | 우선순위 큐 자료구조 사용. reverseOrder()를 사용하여 내림차순 정렬 하는 방식을 기억할 것.                                 |


</details>