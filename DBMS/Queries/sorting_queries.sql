-- sort data by last NAME
SELECT 
    contactLastName, 
    contactFirstName 
fROM customers 
ORDER BY `contactLastName`;

------------------------
SELECT 
    contactLastName, 
    contactFirstName 
FROM 
    customers 
ORDER BY `contactLastName` DESC, 
    `contactFirstName` ASC;
+-----------------+------------------+
| contactLastName | contactFirstName |
+-----------------+------------------+
| Young           | Dorothy          |
| Young           | Jeff             |
| Young           | Julie            |
| Young           | Mary             |
| Yoshido         | Juri             |
| Walker          | Brydey           |
| Victorino       | Wendy            |
| Urs             | Braun            |
| Tseng           | Jerry            |
| Tonini          | Daniel           |
| Thompson        | Steve            |
| Thompson        | Valarie          |
| Taylor          | Leslie           |
| Taylor          | Sue              |
| Tamuri          | Yoshi            |
| Suominen        | Kalle            |
| Sommer          | Martín           |
| Snowden         | Tony             |
| Smith           | Thomas           |
| Shimamura       | Akiko            |
| Semenov         | Alexander        |
| Schuyler        | Bradley          |
| Schmitt         | Carine           |
| Saveley         | Mary             |
| Salazar         | Rosa             |
| Saavedra        | Eduardo          |
| Rovelli         | Giovanni         |
| Roulet          | Annette          |
| Roel            | José Pedro       |
| Rodriguez       | Lino             |
| Ricotti         | Franco           |
| Rancé           | Martine          |
| Pipps           | Georg            |
| Piestrzeniewicz | Zbyszek          |
| Pfalzheim       | Henriette        |
| Petersen        | Jytte            |
| Perrier         | Dominique        |
| Ottlieb         | Sven             |
| Oeztan          | Veysel           |
| OHara          | Anna             |
| Nelson          | Allen            |
| Nelson          | Susan            |
| Natividad       | Eric             |
| Müller          | Rita             |
| Murphy          | Julie            |
| Murphy          | Leslie           |
| Moroni          | Maurizio         |
| Moos            | Hanna            |
| Messner         | Renate           |
| Mendel          | Roland           |
| McRoy           | Sarah            |
| McKenna         | Patricia         |
| MacKinlay       | Wales            |
| Lincoln         | Elizabeth        |
| Lewis           | Dan              |
| Leong           | Kelvin           |
| Lee             | Kwai             |
| Lebihan         | Laurence         |
| Larsson         | Martha           |
| Labrune         | Janine           |
| Kuger           | Armand           |
| Koskitalo       | Pirkko           |
| Kloss           | Horst            |
| Klaeboe         | Jan              |
| King            | Jean             |
| King            | Julie            |
| Kentary         | Mory             |
| Keitel          | Roland           |
| Karttunen       | Matti            |
| Josephs         | Karin            |
| Ibsen           | Palle            |
| Huxley          | Adrian           |
| Huang           | Wing             |
| Holz            | Mihael           |
| Hernandez       | Maria            |
| Hernandez       | Marta            |
| Henriot         | Paul             |
| Hashimoto       | Juri             |
| Harrison        | Ed               |
| Graham          | Mike             |
| Gao             | Mike             |
| Frick           | Michael          |
| Frick           | Steve            |
| Frick           | Sue              |
| Freyre          | Diego            |
| Fresnière       | Jean             |
| Franken         | Peter            |
| Franco          | Keith            |
| Franco          | Valarie          |
| Feuer           | Alexander        |
| Fernandez       | Jesus            |
| Ferguson        | Peter            |
| Donnermeyer     | Michael          |
| Dewey           | Catherine        |
| Devon           | Elizabeth        |
| de Castro       | Isabel           |
| Da Silva        | Daniel           |
| Cruz            | Arnold           |
| Cramer          | Philip           |
| Clenahan        | Sean             |
| Citeaux         | Frédérique       |
| Choi            | Yu               |
| Chandler        | Brian            |
| Cervantes       | Francisca        |
| Cassidy         | Dean             |
| Cartrain        | Pascale          |
| Camino          | Alejandra        |
| Calaghan        | Ben              |
| Brown           | Ann              |
| Brown           | Julie            |
| Brown           | William          |
| Bertrand        | Marie            |
| Bergulfsen      | Jonas            |
| Berglund        | Christina        |
| Bennett         | Helen            |
| Benitez         | Violeta          |
| Barajas         | Miguel           |
| Ashworth        | Rachel           |
| Anton           | Carmen           |
| Andersen        | Mel              |
| Altagar,G M     | Raanan           |
| Accorti         | Paolo            |
+-----------------+------------------+


-- orderline items from orderDetails table to calculate subtotal and sort subtotal

SELECT 
    orderNumber, 
    orderLineNumber, 
    quantityOrdered*priceEach AS subtotal 
FROM orderDetails 
ORDER BY subtotal 
    DESC LIMIT 10;

+-------------+-----------------+----------+
| orderNumber | orderLineNumber | subtotal |
+-------------+-----------------+----------+
|       10403 |               9 | 11503.14 |
|       10405 |               5 | 11170.52 |
|       10407 |               2 | 10723.60 |
|       10404 |               3 | 10460.16 |
|       10312 |               3 | 10286.40 |
|       10424 |               6 | 10072.00 |
|       10348 |               8 |  9974.40 |
|       10405 |               3 |  9712.04 |
|       10196 |               5 |  9571.08 |
|       10206 |               6 |  9568.73 |
+-------------+-----------------+----------+
10 rows in set (0.01 sec)

---------
SELECT orderNumber, 
    status 
FROM orders 
ORDER BY 
    FIELD(status,"In Process","On Hold", "Cancelled", "Resolved","Disputed","Shipped");
+-------------+------------+
| orderNumber | status     |
+-------------+------------+
|       10425 | In Process |
|       10421 | In Process |
|       10422 | In Process |
|       10420 | In Process |
|       10424 | In Process |
|       10423 | In Process |
|       10414 | On Hold    |
|       10401 | On Hold    |
|       10334 | On Hold    |
|       10407 | On Hold    |
+-------------+------------+
10 rows in set (0.00 sec)