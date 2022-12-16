# Interview Calendar API
An API to schedule interviews

This API allows the user to schedule one hour interviews. 
The user can be the interviewer or the candidate.

The following requests are available:
- /candidates -> returns a list of candidates
- /addCandidate -> adds a candidate (parameters: firstName and lastName)
- /interviewers -> returns a list of interviewers
- /addInterviewer -> adds a interviewer (parameters: firstName and lastName)
- /checkAvailability -> checks the availability of a person (parameters: typePerson (C: candidate, I: interviewer), idPerson)
- /setAvailability -> sets the availability of a person (parameters: typePerson (C: candidate, I: interviewer), idPerson, dayOfWeek, ini, end)
- /interviews -> returns a list of interviews
- /scheduleInterview-> schedules a interview (parameters: idInterviewer, idCandidate, dayOfWeek, hour)

Tecnical details:
- It was implemented with spring boot 
- Runs on top of a mysql database
