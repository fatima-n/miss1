<%@ include file="../common/header.jspf"%>
<%@ include file="../common/navigation.jspf"%>

	
	<h1>Welcome ${name} to My collection car Page From Saraya Tech</h1>
	

	<p>g 
		
		<table>
			<thead>
					<tr>
						<td>Image</td>
						<td>Year</td>
						<td>Make</td>
						<td>Model</td>
						<td> Delete car</td>
					</tr>
			</thead>
			<tbody>
			<c:forEach items="${cars}" var="car">
				<tr>
					<td><img src = "${car.image}" width="100" height="100" /></td>
					<td>${car.year}</td>
					<td>${car.make}</td>
					<td>${car.model}</td>
					<td>&nbsp; &nbsp; 
					<a href="/delete.do?id=${car.id}">Delete</a></td>
				</tr>
			</c:forEach>	
			</tbody>
			
			
			
		</table>
		<p>
		<form action="/car.do" method="post">
			<input type="text" name = "yr">
			<input type="text" name = "mk">
			<input type="text" name = "md">
			<input type="text" name = "im">
			<input type="submit" value="Add a Car">
		</form>
	</p>
<%@ include file="../common/footer.jspf"%>