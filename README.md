# Step Semester 3 — Daily Progress Log

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

