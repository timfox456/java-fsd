# Phase 3 End Project - Create a Task Manager

## Application

## Project Objective:
Create a task manager application with spring boot and spring Data JPA.

### Background of Problem Statement:
The application will have UI in JSP.

At least 4 JSP Pages -> create task, display tasks, delete tasks, and update task.

Likely additional pages for login / registration, plus welcome page.

### Important Notes:
 *  Project must be well organized in packages.
 * Usage of DAO, DaoIMPL, Service, Entity, and custom exception handling
 * All data must persist in the database. (User information should also be stored in database)
 * User must be logged in before adding or seeing the tasks. (spring boot security is acceptable but not mandatory.)
 * User must get registered, to perform the login.
 * User must implement swagger to generate the docs and UI.  (use the provided springfox module)

### Important fields of this application:
 * Task name (text box)
 * Start date (date picker)
 * End date (date picker)
 * Description (text area)
 * Email (text box)
 * Severity (drop down) (High, medium, low)
 * User (tasks should belong to a user)