<?php

$to = "dinefour4@gmail.com";

$name = $_POST['name'];
$email = $_POST['email'];
if(isset($_POST['place']))
{
    $option = $_POST['place']; 
}
$mobile = $_POST['mobile']; 

$txt = "$name has email       $email        and mobile        $mobile        ";

if(isset($_POST['submit'])) {
	$mail = mail($to, $option, $txt);
}
?>

<!doctype html>
<html>
	<head>
		<link rel="stylesheet" href="style1.css">
		<title>Thank You!</title>
	</head>
	<body>
		<div id = "end">
			<h1>Thank you for signing up. Do expect to receive an Email regarding further information few days prior the event. </h1>
                        <h2> Again, thank you for participating! </h2>
                         <h3> <font size="5">email dinefour4@gmail.com for any further questions</font> </h3>
		</div>
	</body>
</html>		