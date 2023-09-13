/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package employee.database.service.impl;

import employee.database.model.PositionType;
import employee.database.service.base.PositionTypeLocalServiceBaseImpl;

import java.io.InputStream;
import java.text.ParseException;
import java.util.Scanner;

/**
 * @author Brian Wing Shun Chan
 */
public class PositionTypeLocalServiceImpl
	extends PositionTypeLocalServiceBaseImpl {
	public void fromCSV(InputStream inputStream) throws ParseException {
		try (Scanner scanner = new Scanner(inputStream)) {
			while (scanner.hasNextLine())
				try(Scanner lineScanner = new Scanner(scanner.nextLine())) {
					lineScanner.useDelimiter(",");

					PositionType pt = createPositionType(lineScanner.nextLong());
					pt.setName(lineScanner.next());

					addPositionType(pt);
				}
		}
	}
}