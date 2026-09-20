# Step Semester 3 — Daily Progress Log

## Date: 20-09-2026
**Today's Work:**
- Created feature/session_7 branch from develop.
- Solved all 5 Category C class practice problems in encapsulation.class_problems:
  - Problem 1: The Piggy Bank — The Piggy Bank — private savings mutated only via deposit/withdraw, over-withdrawals rejected, final ID and no setter.
  - Problem 2: The Quiz Scorecard — The Quiz Scorecard — private result array with a recorded counter, extra answers rejected, only getScore() exposed.
  - Problem 3: The Nickname Tag — The Nickname Tag — final class with final fields, name split once in the constructor, nickname built on request.
  - Problem 4: The Locker Code — The Locker Code — write-only private code with no getter, change guarded by the current code, final locker number.
  - Problem 5: The Attendance Sheet — The Attendance Sheet — private name array with duplicate check, exposing only getPresentCount() and isPresent().
- Completed all 5 Category C assignment problems in encapsulation.assigment_problems:
  - Problem 1: The Health Bar (A1) — The Health Bar — private health clamped with Math.max/Math.min between 0 and a final max health.
  - Problem 2: The Playlist (A2) — The Playlist — private song array returned through Arrays.copyOf so edits to the copy never leak back.
  - Problem 3: The Password Checker (A3) — The Password Checker — final private password with no getter, strength rated by length (Weak/Medium/Strong).
  - Problem 4: The Traffic Light (A4) — The Traffic Light — private index into a constant color cycle, next() as the only way to change it.
  - Problem 5: The Shopping Cart (A5) — The Shopping Cart — private price array, total computed on request by looping, read-only item count.

**Next Session Plan:**
- Continue with Week 8 problems in Session 8.

**Issues Faced:**
- The assignment's Character class shadows java.lang.Character inside its package, so that package avoids using java.lang.Character directly.

---

## Date: 13-09-2026
**Today's Work:**
- Created feature/session_6 branch from develop.
- Solved all 5 Category C class practice problems in classes_objects.class_problems:
  - Problem 1: Student Placement Record Management — Student Placement Record Management — PlacementRecord objects in an array replacing out-of-sync parallel arrays.
  - Problem 2: Hostel Mess Wallet Management — Hostel Mess Wallet Management — private balance with validated topUp/deduct, negative opening clamped to 0, no setter.
  - Problem 3: Course Credit Management — Course Credit Management — theory-only constructor chains to the full constructor via this(...) with labCredits 0.
  - Problem 4: Library ID Card Management — Library ID Card Management — shared reference vs separate object demonstrated with == on identical field values.
  - Problem 5: Student and College Information Management — Student and College Information Management — static collegeName and studentCount incremented in the constructor, printed by static printCollegeInfo().
- Completed all 5 Category C assignment problems in classes_objects.assigment_problems:
  - Problem 1: Library Inventory Management (A1) — Library Inventory Management — BookInventory objects in an array replacing parallel arrays.
  - Problem 2: Payroll Salary Management (A2) — Payroll Salary Management — private basicSalary and bonus, validated creditBonus and 0–100% deductTax, read-only getNetSalary.
  - Problem 3: Employee Profile Creation (A3) — Employee Profile Creation — intern constructor chains with this(...) at salary 0 then flips isIntern to true.
  - Problem 4: Exam Hall Ticket Reference Management (A4) — Exam Hall Ticket Reference Management — reference aliasing vs a new object with identical fields, checked with ==.
  - Problem 5: Employee and Company Information Management (A5) — Employee and Company Information Management — static companyName and employeeCount with a static printCompanyInfo() called through the class name.

**Next Session Plan:**
- Continue with Week 7 problems in Session 7.

**Issues Faced:**
- Assignment Problems 3 and 5 both asked for a class named Employee in the same package, so Problem 5 was implemented as CompanyEmployee to avoid the name clash.

---

## Date: 10-09-2026
**Today's Work:**
- Created feature/session_5 branch from develop.
- Solved all 5 Category C class practice problems in arrays_methods.class_problems:
  - Problem 1: Hackathon Score Curve Booster — Hackathon Score Curve Booster — in-place bonus through an array reference with no return value, printed via Arrays.toString.
  - Problem 2: Duplicate Team Name Finder — Duplicate Team Name Finder — nested-loop pairwise check comparing each name only with later names, no Collections.
  - Problem 3: Top-3 Podium Finder — Top-3 Podium Finder — single-pass first/second/third tracking that keeps tied top scores without any sort.
  - Problem 4: Hackathon Seating Grid Optimizer — Hackathon Seating Grid Optimizer — private rowAverage helper reused per row of a jagged 2D grid to label Quiet/Buzzing zones.
  - Problem 5: Placement Drive Shortlisting & Ranking Engine — Placement Drive Shortlisting & Ranking Engine — overloaded isEligible (CGPA >= 7.0, or CGPA >= 6.5 with coding >= 60), Comparable Candidate ranked by cgpa*10 + coding/2 via Arrays.sort.
- Completed all 5 Category C assignment problems in arrays_methods.assigment_problems:
  - Problem 1: Fantasy Team Score Multiplier (A1) — Fantasy Team Score Multiplier — captain 2x and vice-captain 1.5x applied in place with two direct index writes and index validation.
  - Problem 2: Duplicate Player Pick Checker (A2) — Duplicate Player Pick Checker — nested-loop pairwise comparison with early exit on the first repeated pick.
  - Problem 3: Top Performer Tracker (A3) — Top Performer Tracker — single-pass min/max tracking reporting the spread without sorting.
  - Problem 4: Match Day Grid Analyzer (A4) — Match Day Grid Analyzer — rowAverage helper reused per match to label Power Surge vs Normal on a jagged grid.
  - Problem 5: Fantasy League Auto-Draft Ranking Engine (A5) — Fantasy League Auto-Draft Ranking Engine — overloaded isDraftable (10+ matches, or 5+ matches and fit), Comparable Player sorted by batting average with Arrays.sort.

**Next Session Plan:**
- Continue with Week 6 problems in Session 6.

**Issues Faced:**
- The composite score and eligibility cutoffs were left to the student, so they were derived from the sample output (cgpa*10 + coding/2 gives 102.0, 100.5 and 85.0 exactly).

---

## Date: 05-09-2026
**Today's Work:**
- Created feature/session_4 branch from develop.
- Solved all 5 Category C class practice problems in arrays.class_problems:
  - Problem 1: Two Sum — Two Sum — nested-loop pairwise search returning the matching index pair.
  - Problem 2: Best Time to Buy and Sell Stock — Buy and Sell Stock — single pass with a running minimum and best profit.
  - Problem 3: Contains Duplicate — Contains Duplicate — pairwise comparison with early exit.
  - Problem 4: Merge Two Sorted Arrays — Merge Sorted Arrays — two-pointer merge handling an empty input.
  - Problem 5: Rotate Array — Rotate Array — modulo wraparound indexing into a new array.
- Completed all 5 Category C assignment problems in arrays.assigment_problems:
  - Problem 1: Product of Array Except Self (A1) — Product Except Self — prefix and suffix products in O(n) without division, zero-safe.
  - Problem 2: Maximum Subarray (A2) — Maximum Subarray — Kadane's algorithm handling an all-negative array.
  - Problem 3: 3Sum (A3) — 3Sum — sort plus two pointers with duplicate skipping in O(n²).
  - Problem 4: Subarray Sum Equals K (A4) — Subarray Sum Equals K — prefix sums with a HashMap seeded with the empty prefix.
  - Problem 5: Find Minimum in Rotated Sorted Array (A5) — Rotated Array Minimum — modified binary search that also handles no rotation.

**Next Session Plan:**
- Continue with Week 5 problems in Session 5.

**Issues Faced:**
- Subarray Sum needed the map seeded with prefix 0 -> 1 so subarrays starting at index 0 are counted; sliding window was avoided because of negative values.

---

## Date: 02-09-2026
**Today's Work:**
- Created feature/session_3 branch from develop.
- Solved all 5 Category C class practice problems in classes_objects.class_problems:
  - Problem 1: Simple Student Record Class — Simple Student Record — Student class with name and marks set through direct field access.
  - Problem 2: Two Objects, Two Separate States — Two Separate States — two HostelRoom objects proving instance fields are independent.
  - Problem 3: Reading Java's Default Field Values — Default Field Values — unset LibraryCard fields print null, 0 and false.
  - Problem 4: Basic Constructor for a Course — Basic Constructor — Course constructor using this.field = parameter.
  - Problem 5: Counting Objects With a Static Field — Static Counter — shared static totalApplicants incremented in the constructor and read via the class name.
- Completed all 5 Category C assignment problems in classes_objects.assigment_problems:
  - Problem 1: Simple Book Record Class (A1) — Simple Book Record — Book class with title and price set via direct field access.
  - Problem 2: Two Objects, Two Separate Occupancy Counts (A2) — Separate Occupancy Counts — two ExamHall objects with independent seatsFilled values.
  - Problem 3: Reading Java's Default Field Values (A3) — Default Field Values — unset Employee fields print null, 0.0 and false.
  - Problem 4: Basic Constructor for a Product (A4) — Basic Constructor — Product constructor assigning id and name with this.
  - Problem 5: Counting Objects With a Static Field (A5) — Static Counter — shared static totalOrders counting four created orders.

**Next Session Plan:**
- Continue with Week 4 problems in Session 4.

**Issues Faced:**
- Kept the field-access problems constructor-free as the sheet asked, so default values could be shown before any assignment.

---

## Date: 31-08-2026
**Today's Work:**
- Created feature/session_2 branch from develop.
- Solved all 5 Category C class practice problems in strings.class_problems:
  - Problem 1: Vowel & Consonant Counter — Vowel & Consonant Counter — charAt() traversal with lowercase normalisation and a vowel lookup string.
  - Problem 2: CSV Student Record Parser — CSV Student Record Parser — split(",") with field-count validation and formatted record output.
  - Problem 3: File Extension Validator — File Extension Validator — lastIndexOf('.') + substring() with equalsIgnoreCase() against an allowed-extension list.
  - Problem 4: Masked Phone Number Formatter — Masked Phone Number Formatter — length and digit validation, then StringBuilder insert() to build the mask.
  - Problem 5: Bank Transaction Reference Generator & Validator — Bank Transaction Reference Validator — trim() + partial uppercase normalisation, isLetter()/isDigit() checks with specific error reasons and StringBuilder formatting.
- Completed all 5 Category C assignment problems in strings.assigment_problems:
  - Problem 1: ATM PIN Length Validator (A1) — ATM PIN Length Validator — length() check against a PIN_LENGTH constant with one if/else.
  - Problem 2: Word Reversal Encoder (A2) — Word Reversal Encoder — split(" "), per-word reverse loop into a StringBuilder and space-joined output.
  - Problem 3: Product Inventory CSV Parser (A3) — Product Inventory CSV Parser — split(",") with exactly-3-fields validation and formatted output.
  - Problem 4: Library ISBN Normalizer & Validator (A4) — Library ISBN Normalizer — trim() and publisher-code uppercase, multi-stage letter/digit validation with specific reasons and StringBuilder display.
  - Problem 5: Stop-Word-Filtered Word Frequency Report (A5) — Stop-Word-Filtered Word Frequency — replace() cleanup, split("\\s+"), stop-word skip, LinkedHashMap counting and descending sort.

**Next Session Plan:**
- Continue with Week 3 problems in Session 3.

**Issues Faced:**
- Reference codes shorter than 3 characters would break substring() during normalization, so normalize guards the length before uppercasing the bank or publisher code.

---

## Date: 30-08-2026
**Today's Work:**
- Created feature/session_1 branch from develop.
- Solved all 5 Category C class practice problems in fundamentals.class_problems:
  - Problem 1: Rock-Paper-Scissors Game — Rock-Paper-Scissors Game — Random computer moves, rule-based playRound, tabular round log and win/loss/draw percentage scoreboard.
  - Problem 2: Palindrome Checker (3 Approaches) — Palindrome Checker — iterative two-pointer, recursive substring and array-reversal approaches cross-checked on the same input.
  - Problem 3: BMI Calculator for a Team — BMI Calculator — parallel arrays, BMI formula with input validation, WHO status classification and formatted report.
  - Problem 4: First Non-Repeating Character — First Non-Repeating Character — frequency array counting followed by an early-exit left-to-right scan.
  - Problem 5: Reverse Customer Name — Reverse Customer Name — in-place swap on a char array copy so the original String stays untouched.
- Completed all 5 Category C assignment problems in fundamentals.assigment_problems:
  - Problem 1: The Exam Hall Seat Duplication Checker (A1) — Exam Hall Seat Duplication Checker — nested-loop comparison with a small tracking array so each duplicate is reported once.
  - Problem 2: The Typing Speed Test Accuracy Checker (A2) — Typing Speed Test Accuracy Checker — charAt() comparison, match counting, accuracy percentage and 1-based first mismatch position.
  - Problem 3: The Traffic Signal Streak Analyzer (A3) — Traffic Signal Streak Analyzer — single pass tracking the current run and the running maximum with its colour.
  - Problem 4: The Warehouse Inventory Balancer (A4) — Warehouse Inventory Balancer — sum accumulation of both sections in one loop and maximum tracking with section and index.
  - Problem 5: The Movie Review Word Length Profiler (A5) — Movie Review Word Length Profiler — split("\\s+") tokenisation and length-based categorisation counts.

**Next Session Plan:**
- Continue with Week 2 problems in Session 2.

**Issues Faced:**
- Week 1 mixed array and string problems, so both were kept under one fundamentals package; the seat checker needed a tracking array so a seat appearing three times is only reported once.

---

