# CS 230 – The Gaming Room: Software Design Document

## Project Overview

This repository contains the completed **software design document** and **Java source code** developed for **The Gaming Room** client as part of the CS 230 course at SNHU.



1. Briefly summarize The Gaming Room client and their software requirements. Who was the client? What type of software did they want you to design?

The Gaming Room is a game studio that wanted to expand their existing Android game, *Draw It or Lose It*, into a **multi-platform web-based application**. The client needed a software solution that could support multiple teams, multiple players per team, and multiple simultaneous game sessions, all while ensuring that game and team names remain unique. The system also required a single active game instance at any time.


2. What did you do particularly well in developing this documentation?

I did particularly well in applying and clearly documenting **object-oriented design principles**, especially the use of the ""Singleton pattern"" for the `GameService` class and the **inheritance hierarchy** with `Entity` as the base class for `Game`, `Team`, and `Player`. The design document clearly communicates these architectural decisions in a way that both the client and developers can understand.



3. What about the process of working through a design document did you find helpful when developing the code?

Working through the design document first helped me identify the relationships between classes before writing a single line of code. Having a clear "UML-style structure" and a defined data model made it much easier to implement the iterator logic and enforce the uniqueness constraints. It prevented me from making ad hoc decisions during coding and kept the implementation aligned with the client's requirements.



4. If you could choose one part of your work on these documents to revise, what would you pick? How would you improve it?

If I could revise one part, I would improve the "domain model and evaluation section" for operating platforms. I would add more quantitative comparisons (performance benchmarks, cost estimates, scalability data) between Linux, Windows, and macOS server options to give the client a more data-driven recommendation rather than a purely qualitative one.



5. How did you interpret the user's needs and implement them into your software design? Why is it so important to consider the user's needs when designing?

I interpreted the user's needs by translating the client's functional requirements — unique game names, multiple teams, multiple players — into concrete class responsibilities and constraints enforced through iterator-based checks. Considering user needs is critical because software that is technically correct but doesn't solve the actual problem has no value. Understanding *why* each requirement exists helps build a system that is both functional and maintainable.



6. How did you approach designing software? What techniques or strategies would you use in the future to analyze and design a similar software application?

I approached the design by first identifying the core **entities** and their relationships, then selecting appropriate **design patterns** (Singleton, Iterator) to solve specific constraints like uniqueness and single-instance control. In the future, I would continue using **UML diagrams** early in the process, apply **SOLID principles** more explicitly, and conduct early prototyping to validate design decisions before committing to a full implementation.

