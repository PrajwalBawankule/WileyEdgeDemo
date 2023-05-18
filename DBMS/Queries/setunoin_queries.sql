--combine last name and first name of employees and customers into a single result set
SELECT firstName, lastName from employees UNION SELECT contactFirstName, contactLastName FROM customers;
+-------------+-----------------+
| firstName   | lastName        |
+-------------+-----------------+
| Gerard      | Bondur          |
| Loui        | Bondur          |
| Larry       | Bott            |
| Anthony     | Bow             |
| Pamela      | Castillo        |
| Jeff        | Firrelli        |
| Julie       | Firrelli        |
| Andy        | Fixter          |
| Martin      | Gerard          |
| Gerard      | Hernandez       |
| Leslie      | Jennings        |
| Barry       | Jones           |
| Yoshimi     | Kato            |
| Tom         | King            |
| Peter       | Marsh           |
| Diane       | Murphy          |
| Mami        | Nishi           |
| Mary        | Patterson       |
| Steve       | Patterson       |
| William     | Patterson       |
| Leslie      | Thompson        |
| Foon Yue    | Tseng           |
| George      | Vanauf          |
| Carine      | Schmitt         |
| Jean        | King            |
| Peter       | Ferguson        |
| Janine      | Labrune         |
| Jonas       | Bergulfsen      |
| Susan       | Nelson          |
| Zbyszek     | Piestrzeniewicz |
| Roland      | Keitel          |
| Julie       | Murphy          |
| Kwai        | Lee             |
| Diego       | Freyre          |
| Christina   | Berglund        |
| Jytte       | Petersen        |
| Mary        | Saveley         |
| Eric        | Natividad       |
| Jeff        | Young           |
| Kelvin      | Leong           |
| Juri        | Hashimoto       |
| Wendy       | Victorino       |
| Veysel      | Oeztan          |
| Keith       | Franco          |
| Isabel      | de Castro       |
| Martine     | Rancé           |
| Marie       | Bertrand        |
| Jerry       | Tseng           |
| Julie       | King            |
| Mory        | Kentary         |
| Michael     | Frick           |
| Matti       | Karttunen       |
| Rachel      | Ashworth        |
| Dean        | Cassidy         |
| Leslie      | Taylor          |
| Elizabeth   | Devon           |
| Yoshi       | Tamuri          |
| Miguel      | Barajas         |
| Julie       | Young           |
| Brydey      | Walker          |
| Frédérique  | Citeaux         |
| Mike        | Gao             |
| Eduardo     | Saavedra        |
| Mary        | Young           |
| Horst       | Kloss           |
| Palle       | Ibsen           |
| Jean        | Fresnière       |
| Alejandra   | Camino          |
| Valarie     | Thompson        |
| Helen       | Bennett         |
| Annette     | Roulet          |
| Renate      | Messner         |
| Paolo       | Accorti         |
| Daniel      | Da Silva        |
| Daniel      | Tonini          |
| Henriette   | Pfalzheim       |
| Elizabeth   | Lincoln         |
| Peter       | Franken         |
| Anna        | O Hara          |
| Giovanni    | Rovelli         |
| Adrian      | Huxley          |
| Marta       | Hernandez       |
| Ed          | Harrison        |
| Mihael      | Holz            |
| Jan         | Klaeboe         |
| Bradley     | Schuyler        |
| Mel         | Andersen        |
| Pirkko      | Koskitalo       |
| Catherine   | Dewey           |
| Steve       | Frick           |
| Wing        | Huang           |
| Julie       | Brown           |
| Mike        | Graham          |
| Ann         | Brown           |
| William     | Brown           |
| Ben         | Calaghan        |
| Kalle       | Suominen        |
| Philip      | Cramer          |
| Francisca   | Cervantes       |
| Jesus       | Fernandez       |
| Brian       | Chandler        |
| Patricia    | McKenna         |
| Laurence    | Lebihan         |
| Paul        | Henriot         |
| Armand      | Kuger           |
| Wales       | MacKinlay       |
| Karin       | Josephs         |
| Juri        | Yoshido         |
| Dorothy     | Young           |
| Lino        | Rodriguez       |
| Braun       | Urs             |
| Allen       | Nelson          |
| Pascale     | Cartrain        |
| Georg       | Pipps           |
| Arnold      | Cruz            |
| Maurizio    | Moroni          |
| Akiko       | Shimamura       |
| Dominique   | Perrier         |
| Rita        | Müller          |
| Sarah       | McRoy           |
| Michael     | Donnermeyer     |
| Maria       | Hernandez       |
| Alexander   | Feuer           |
| Dan         | Lewis           |
| Martha      | Larsson         |
| Sue         | Frick           |
| Roland      | Mendel          |
| Leslie      | Murphy          |
| Yu          | Choi            |
| Martín      | Sommer          |
| Sven        | Ottlieb         |
| Violeta     | Benitez         |
| Carmen      | Anton           |
| Sean        | Clenahan        |
| Franco      | Ricotti         |
| Steve       | Thompson        |
| Hanna       | Moos            |
| Alexander   | Semenov         |
| Raanan      | Altagar,G M     |
| José Pedro  | Roel            |
| Rosa        | Salazar         |
| Sue         | Taylor          |
| Thomas      | Smith           |
| Valarie     | Franco          |
| Tony        | Snowden         |
+-------------+-----------------+
145 rows in set (0.00 sec)



--display full name
SELECT CONCAT(firstName,' ', lastName) AS fullName from employees UNION SELECT CONCAT(contactFirstName, ' ',contactLastName) FROM customers limit 10;

+------------------+
| fullName         |
+------------------+
| Gerard Bondur    |
| Loui Bondur      |
| Larry Bott       |
| Anthony Bow      |
| Pamela Castillo  |
| Jeff Firrelli    |
| Julie Firrelli   |
| Andy Fixter      |
| Martin Gerard    |
| Gerard Hernandez |
+------------------+
10 rows in set (0.00 sec)


-- sort the fullname
SELECT CONCAT(firstName,' ', lastName) AS fullName from employees UNION SELECT CONCAT(contactFirstName, ' ',contactLastName) FROM customers ORDER BY fullName;
+--------------------------+
| fullName                 |
+--------------------------+
| Adrian Huxley            |
| Akiko Shimamura          |
| Alejandra  Camino        |
| Alexander  Feuer         |
| Alexander  Semenov       |
| Allen Nelson             |
| Andy Fixter              |
| Ann  Brown               |
| Anna OHara               |
| Annette  Roulet          |
| Anthony Bow              |
| Armand Kuger             |
| Arnold Cruz              |
| Barry Jones              |
| Ben Calaghan             |
| Bradley Schuyler         |
| Braun Urs                |
| Brian Chandler           |
| Brydey Walker            |
| Carine  Schmitt          |
| Carmen Anton             |
| Catherine  Dewey         |
| Christina  Berglund      |
| Dan Lewis                |
| Daniel  Tonini           |
| Daniel Da Silva          |
| Dean Cassidy             |
| Diane Murphy             |
| Diego  Freyre            |
| Dominique Perrier        |
| Dorothy Young            |
| Ed Harrison              |
| Eduardo  Saavedra        |
| Elizabeth  Lincoln       |
| Elizabeth Devon          |
| Eric Natividad           |
| Foon Yue Tseng           |
| Francisca Cervantes      |
| Franco Ricotti           |
| Frédérique  Citeaux      |
| Georg  Pipps             |
| George Vanauf            |
| Gerard Bondur            |
| Gerard Hernandez         |
| Giovanni  Rovelli        |
| Hanna  Moos              |
| Helen  Bennett           |
| Henriette  Pfalzheim     |
| Horst  Kloss             |
| Isabel  de Castro        |
| Jan Klaeboe              |
| Janine  Labrune          |
| Jean  Fresnière          |
| Jean King                |
| Jeff Firrelli            |
| Jeff Young               |
| Jerry Tseng              |
| Jesus Fernandez          |
| Jonas  Bergulfsen        |
| José Pedro  Roel         |
| Julie Brown              |
| Julie Firrelli           |
| Julie King               |
| Julie Murphy             |
| Julie Young              |
| Juri Hashimoto           |
| Juri Yoshido             |
| Jytte  Petersen          |
| Kalle Suominen           |
| Karin Josephs            |
| Keith Franco             |
| Kelvin Leong             |
| Kwai Lee                 |
| Larry Bott               |
| Laurence  Lebihan        |
| Leslie Jennings          |
| Leslie Murphy            |
| Leslie Taylor            |
| Leslie Thompson          |
| Lino  Rodriguez          |
| Loui Bondur              |
| Mami Nishi               |
| Maria Hernandez          |
| Marie Bertrand           |
| Marta Hernandez          |
| Martha Larsson           |
| Martín  Sommer           |
| Martin Gerard            |
| Martine  Rancé           |
| Mary  Saveley            |
| Mary Patterson           |
| Mary Young               |
| Matti Karttunen          |
| Maurizio  Moroni         |
| Mel Andersen             |
| Michael Donnermeyer      |
| Michael Frick            |
| Miguel Barajas           |
| Mihael Holz              |
| Mike Gao                 |
| Mike Graham              |
| Mory Kentary             |
| Palle Ibsen              |
| Pamela Castillo          |
| Paolo  Accorti           |
| Pascale  Cartrain        |
| Patricia  McKenna        |
| Paul  Henriot            |
| Peter  Franken           |
| Peter Ferguson           |
| Peter Marsh              |
| Philip  Cramer           |
| Pirkko Koskitalo         |
| Raanan Altagar,G M       |
| Rachel Ashworth          |
| Renate  Messner          |
| Rita  Müller             |
| Roland  Mendel           |
| Roland Keitel            |
| Rosa Salazar             |
| Sarah McRoy              |
| Sean Clenahan            |
| Steve Frick              |
| Steve Patterson          |
| Steve Thompson           |
| Sue Frick                |
| Sue Taylor               |
| Susan Nelson             |
| Sven  Ottlieb            |
| Thomas  Smith            |
| Tom King                 |
| Tony Snowden             |
| Valarie Franco           |
| Valarie Thompson         |
| Veysel Oeztan            |
| Violeta Benitez          |
| Wales MacKinlay          |
| Wendy Victorino          |
| William Brown            |
| William Patterson        |
| Wing Huang               |
| Yoshi  Tamuri            |
| Yoshimi Kato             |
| Yu Choi                  |
| Zbyszek  Piestrzeniewicz |
+--------------------------+
145 rows in set (0.00 sec)


--print the type of person as an additional column
SELECT CONCAT(firstName,' ', lastName) AS fullName, "Employee" AS person_type  FROM employees
UNION
SELECT CONCAT(contactFirstName,' ', contactLastName) AS fullName, "Customer" AS person_type  FROM customers ORDER BY fullName;

-- SELECT a.firstName,a.lastName, b.contactFirstName, b.contactLastName FROM employees a, customers b;
--SELECT firstName, lastName from employees WHERE firstName="Leslie";
--SELECT contactFirstName, contactLastName from customers WHERE contactFirstName="Leslie";